import pygame

#Initialize pygame
pygame.init()
screen = pygame.display.set_mode((600, 270))
clock = pygame.time.Clock()
level1 = True

#Constants and colors
TILE_SIZE = 30
WIDTH=20*TILE_SIZE
HEIGHT=9*TILE_SIZE
FPS = 60

#Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)
YELLOW = (255, 255, 0)
PURPLE = (160, 32, 240)

class Player(pygame.sprite.Sprite):
#The player sprite used to traverse the maze
    def __init__(self, initX,initY):
        super().__init__() self.x=initX
        self.y=initY
        self.speed=3
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(BLUE)
        self.rect = self.image.get_rect(topleft=(self.x,self.y))
    def draw_turtle(self):
        pygame.draw.rect(screen, BLUE, (self.x, self.y, TILE_SIZE, TILE_SIZE))
    def update(self, walls):
        old_x, old_y = self.rect.topleft
        keys = pygame.key.get_pressed()

        if keys[pygame.K_LEFT]:
            self.rect.x -= self.speed
        if keys[pygame.K_RIGHT]:
            self.rect.x += self.speed

        if pygame.sprite.spritecollide(self, walls, False):
            self.rect.x = old_x

        if keys[pygame.K_UP]:
            self.rect.y -= self.speed
        if keys[pygame.K_DOWN]:
            self.rect.y += self.speed

        if pygame.sprite.spritecollide(self, walls, False):
            self.rect.y = old_y

class Wall(pygame.sprite.Sprite):
#A solid block that the player cannot move through.
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(BLACK)
        self.rect = self.image.get_rect(topleft=(x, y))class StartPoint(pygame.sprite.Sprite):
#Starting point of each level for the player
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(RED)
        self.rect = self.image.get_rect(topleft=(x, y))

class EndPoint(pygame.sprite.Sprite):
#End point that the player must reach to win the level
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(GREEN)
        self.rect = self.image.get_rect(topleft=(x, y))

class Key(pygame.sprite.Sprite):
#A key the player must collect to finish the level.
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(YELLOW)
        self.rect = self.image.get_rect(topleft=(x,y))

class Enemy(pygame.sprite.Sprite):
#The enemy that follows the player and resets the level if touched
    def __init__(self, initX, initY):
        super().__init__()
        self.x=initX
        self.y=initY
        self.speed=2
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(FRICKING_MAROON)
        self.rect = self.image.get_rect(topleft=(initX, initY))
    def draw_turtle(self):
        pygame.draw.rect(screen, FRICKING_MAROON, (self.x, self.y, TILE_SIZE, TILE_SIZE))
    #The problem child that tells the enemy how to move
    def update(self, walls, player):
      old_x, old_y = self.rect.topleft

      if self.rect.x < player.rect.x:
          self.rect.x += self.speed
      elif self.rect.x > player.rect.x:
          self.rect.x -= self.speed

      if pygame.sprite.spritecollide(self, walls, False):
          self.rect.x = old_x

      if self.rect.y < player.rect.y:
          self.rect.y += self.speed
      elif self.rect.y > player.rect.y:
          self.rect.y -= self.speed

      if pygame.sprite.spritecollide(self, walls, False):
          self.rect.y = old_y


class DeathBlock(pygame.sprite.Sprite):
#A block that makes the player restart the level
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(PURPLE)
        self.rect = self.image.get_rect(topleft=(x,y))

class StartPoint(pygame.sprite.Sprite):
#Starting point of each level for the player
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface([TILE_SIZE, TILE_SIZE])
        self.image.fill(RED)
        self.rect = self.image.get_rect(topleft=(x, y))

def load_maze(filename):
#Loads the maze layout from a text file and creates the corresponding sprites.
    all_sprites = pygame.sprite.Group()
    wall_sprites = pygame.sprite.Group()
    start_point = None
    end_point = None
    player = None
    key = None
    maze_level = []

    with open(filename, 'r') as file:
        for line in file:
            maze_level.append(line.split())
    for row_index, row in enumerate(maze_level):
        for col_index, char in enumerate(row):
            x = col_index * TILE_SIZE
            y = row_index * TILE_SIZE
                
            if char == '1':
                wall = Wall(x, y)
                all_sprites.add(wall)
                wall_sprites.add(wall)
            elif char == 'S':
                start_point = StartPoint(x, y)
                all_sprites.add(start_point)
                player = Player(x, y)
                player.draw_turtle()
            elif char == 'E':
                end_point = EndPoint(x, y)
                all_sprites.add(end_point)
            elif char == 'K':
                key = Key(x, y)
                all_sprites.add(key)

    # Add player to the group after maze objects to draw on top
    if player:
        all_sprites.add(player)

    return all_sprites, wall_sprites, player, start_point, end_point, key

def main():
    #Main function to run the game.
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Maze Game")
    clock = pygame.time.Clock()

    #Load level1 maze
    all_sprites, wall_sprites, player, _, end_point, k = load_maze("U:\MazeProject\MazeL1.txt")

    level1 = True
    level2 = False
    got_key = False
    game_won = False
    
    while level1:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                print("\nCoward.\n")
                level1 = False

        #Update all sprites
        all_sprites.update(wall_sprites)

        #Colisions
        if pygame.sprite.collide_rect(k, player):
            got_key = True
        if pygame.sprite.collide_rect(end_point, player) and got_key:
            level2 = True
            level1 = False
            got_key = False

        #Screen refresh
        screen.fill(WHITE)
        all_sprites.draw(screen)
        pygame.display.flip()
        clock.tick(FPS)

    #Load level2
    all_sprites, wall_sprites, player, _, end_point, k = load_maze("U:\MazeProject\MazeL2.txt")

    while level2:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                print("\nCoward.\n")
                level2 = False

        all_sprites.update(wall_sprites)

        if pygame.sprite.collide_rect(k, player):
            Key.got_key = True

        if pygame.sprite.collide_rect(end_point, player) and got_key:
            game_won = True
            level2 = False

        screen.fill(WHITE)
        all_sprites.draw(screen)
        pygame.display.flip()
        clock.tick(FPS)
    pygame.quit()
    if game_won:
        for message in ["Congratulations.",
                        "You've beat this stupid game",
                        "just so i could have my grade go up"
                    ]:
            print(message)
            pygame.time.delay(2000)
    pygame.time.delay(4000)
    print("I got my well earned points\n\n\n\n\n\n\n\n im so goated")

main()

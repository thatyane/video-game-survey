export type GamePlatform = 'XBOX' | 'NINTENDO' | 'PLAYSTATION';

export type Game = {
  id: number;
  title: string;
  platform: GamePlatform;
  label: string;
  value: number;
};

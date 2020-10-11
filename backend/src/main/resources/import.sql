INSERT INTO genre (id, name) VALUES (1, 'Tiro');
INSERT INTO genre (id, name) VALUES (2, 'Esporte');
INSERT INTO genre (id, name) VALUES (3, 'RPG');
INSERT INTO genre (id, name) VALUES (4, 'Ação-aventura');
INSERT INTO genre (id, name) VALUES (5, 'Plataforma');
INSERT INTO genre (id, name) VALUES (6, 'Battle Royale');

INSERT INTO game (id, title, platform, genre_id) VALUES(1, 'Ring Fit Adventure', 'NINTENDO', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(2, 'Captain Toad''s Treasure Tracker', 'NINTENDO', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(3, 'Astral Chain', 'NINTENDO', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(4, 'Monster Hunter Ultimate Generations', 'NINTENDO', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(5, 'Donkey Kong Country: Tropical Freeze', 'NINTENDO', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(6, 'Pokémon Sword & Shield', 'NINTENDO', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(7, 'Mario + Rabbids Kingdom Battle', 'NINTENDO', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(8, 'Super Mario Maker', 'NINTENDO', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(9, 'Mario Kart', 'NINTENDO', 2);
INSERT INTO game (id, title, platform, genre_id) VALUES(10, 'Luigi''s Mansion', 'NINTENDO', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(11, 'Fire Emblem: Three Houses', 'NINTENDO', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(12, 'Super Mario Odyssey', 'NINTENDO', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(13, 'Super Smash Bros. Ultimate', 'NINTENDO', 2);
INSERT INTO game (id, title, platform, genre_id) VALUES(14, 'The Legend of Zelda', 'NINTENDO', 4);

INSERT INTO game (id, title, platform, genre_id) VALUES(15, 'FIFA', 'PLAYSTATION', 2);
INSERT INTO game (id, title, platform, genre_id) VALUES(16, 'Ratchet & Clank', 'PLAYSTATION', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(17, 'Monster Hunter World', 'PLAYSTATION', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(18, 'Shadow of the Colossus', 'PLAYSTATION', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(19, 'Fortnite', 'PLAYSTATION', 6);
INSERT INTO game (id, title, platform, genre_id) VALUES(20, 'Uncharted', 'PLAYSTATION', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(21, 'Marvel’s Spider-Man', 'PLAYSTATION', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(22, 'The Last of Us', 'PLAYSTATION', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(23, 'Grand Theft Auto', 'PLAYSTATION', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(24, 'Bloodborne', 'PLAYSTATION', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(25, 'The Witcher 3', 'PLAYSTATION', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(26, 'God of War', 'PLAYSTATION', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(27, 'Fall Guys', 'PLAYSTATION', 6);
INSERT INTO game (id, title, platform, genre_id) VALUES(28, 'Dragon Age Inquisition', 'PLAYSTATION', 3);

INSERT INTO game (id, title, platform, genre_id) VALUES(29, 'Dragon Age Inquisition', 'XBOX', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(30, 'Cyberpunk 2077', 'XBOX', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(31, 'Halo', 'XBOX', 1);
INSERT INTO game (id, title, platform, genre_id) VALUES(32, 'Gears 5', 'XBOX', 1);
INSERT INTO game (id, title, platform, genre_id) VALUES(33, 'Monster Hunter World', 'XBOX', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(34, 'Assassin''s Creed Odyssey', 'XBOX', 3);
INSERT INTO game (id, title, platform, genre_id) VALUES(35, 'Titanfall ', 'XBOX', 1);
INSERT INTO game (id, title, platform, genre_id) VALUES(36, 'Forza Horizon 4', 'XBOX', 2);
INSERT INTO game (id, title, platform, genre_id) VALUES(37, 'Inside', 'XBOX', 5);
INSERT INTO game (id, title, platform, genre_id) VALUES(38, 'Sekiro', 'XBOX', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(39, 'Red Dead Redemption 2', 'XBOX', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(40, 'Grand Theft Auto', 'XBOX', 4);
INSERT INTO game (id, title, platform, genre_id) VALUES(41, 'The Witcher 3', 'XBOX', 3);

INSERT INTO record (game_id, email, name, age, moment) VALUES (3, 'tulio@gmail.com', 'Tulio', 44, TIMESTAMP WITH TIME ZONE '2020-10-10T20:59:19Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (25, 'alex@hotmail.com', 'Alex', 33, TIMESTAMP WITH TIME ZONE '2020-06-20T20:30:26Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (11, 'marcos35@hotmail.com', 'Marcos', 45, TIMESTAMP WITH TIME ZONE '2020-09-15T15:01:37Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (23, 'tony@gmail.com', 'Tony', 32, TIMESTAMP WITH TIME ZONE '2020-09-22T19:05:38Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (2, 'meire@gmail.com', 'Meire', 24, TIMESTAMP WITH TIME ZONE '2020-07-11T11:31:03Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (12, 'mariajose@hotmail.com', 'Maria', 31, TIMESTAMP WITH TIME ZONE '2020-07-11T00:36:59Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (5, 'alex_soares@gmail.com', 'Alex', 39, TIMESTAMP WITH TIME ZONE '2020-06-14T03:33:16Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (3, 'aline_85@gmail.com', 'Aline', 42, TIMESTAMP WITH TIME ZONE '2020-09-20T09:27:22Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (14, 'filipepf@gmail.com', 'Filipe', 27, TIMESTAMP WITH TIME ZONE '2020-06-25T06:44:58Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (40, 'pedrog@yahoo.com', 'Pedro', 45, TIMESTAMP WITH TIME ZONE '2020-09-29T15:26:15Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (14, 'bgl@gmail.com', 'Benicio', 39, TIMESTAMP WITH TIME ZONE '2020-05-04T21:41:42Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (1, 'jorgegustavo@gmail.com', 'Jorge', 42, TIMESTAMP WITH TIME ZONE '2020-05-30T12:35:32Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (38, 'rogerioa@yahoo.com.br', 'Rogerio', 32, TIMESTAMP WITH TIME ZONE '2020-09-14T23:27:26Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (8, 'gerpontes@gmail.com', 'Germano', 44, TIMESTAMP WITH TIME ZONE '2020-07-18T01:20:44Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (32, 'emilioff@hotmail.com', 'Emilio', 42, TIMESTAMP WITH TIME ZONE '2020-05-31T02:43:24Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (20, 'josefa@hotmail.com', 'Josefa', 32, TIMESTAMP WITH TIME ZONE '2020-08-11T18:00:15Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (20, 'ma_84@yahoo.com.br', 'Marcela', 24, TIMESTAMP WITH TIME ZONE '2020-09-08T20:15:34Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (31, 'manu_88@yahoo.com.br', 'Emanuel', 32, TIMESTAMP WITH TIME ZONE '2020-07-17T04:35:32Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (30, 'lucianoorleon@yahoo.com.br', 'Luciano', 38, TIMESTAMP WITH TIME ZONE '2020-08-20T04:20:48Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (5, 'andresilva@yahoo.com.br', 'Andre', 27, TIMESTAMP WITH TIME ZONE '2020-07-29T22:41:07Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (6, 'eron_e@yahoo.com.br', 'Eron', 27, TIMESTAMP WITH TIME ZONE '2020-08-14T21:05:20Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (9, 'eliane.a@yahoo.com.br', 'Eliane', 24, TIMESTAMP WITH TIME ZONE '2020-05-06T21:06:39Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (29, 'msoares@gmail.com', 'Milton', 36, TIMESTAMP WITH TIME ZONE '2020-10-01T14:24:21Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (4, 'titot_pontes@hotmail.com', 'Tito', 26, TIMESTAMP WITH TIME ZONE '2020-10-05T16:59:51Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (11, 'adolforibeiro_84@hotmail.com', 'Adolfo', 34, TIMESTAMP WITH TIME ZONE '2020-07-23T14:22:42Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (7, 'marinaroberta@hotmail.com', 'Marina', 39, TIMESTAMP WITH TIME ZONE '2020-07-23T14:02:26Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (10, 'adriano_jorge@hotmail.com', 'Adriano', 45, TIMESTAMP WITH TIME ZONE '2020-07-24T03:59:40Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (10, 'janainagusmao@hotmail.com', 'Janaina', 39, TIMESTAMP WITH TIME ZONE '2020-06-26T10:37:29Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (13, 'marcelamsoares@hotmail.com', 'Marcela', 20, TIMESTAMP WITH TIME ZONE '2020-06-19T19:02:59Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (3, 'bob_84_henrique@hotmail.com', 'Roberto', 41, TIMESTAMP WITH TIME ZONE '2020-06-22T00:12:31Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (11, 'chico@gmail.com', 'Francisco', 29, TIMESTAMP WITH TIME ZONE '2020-07-01T09:59:35Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (2, 'mana_44@gmail.com', 'Manasses', 20, TIMESTAMP WITH TIME ZONE '2020-06-24T12:09:54Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (6, 'luis.henrique@gmail.com', 'Luis', 21, TIMESTAMP WITH TIME ZONE '2020-07-05T15:09:38Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (9, 'gil.berto@gmail.com', 'Gilberto', 22, TIMESTAMP WITH TIME ZONE '2020-06-20T15:29:45Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (6, 'ellen.garcia@gmail.com', 'Ellen', 33, TIMESTAMP WITH TIME ZONE '2020-10-08T03:26:33Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (11, 'rodrigo_bernardo@gmail.com', 'Rodrigo', 40, TIMESTAMP WITH TIME ZONE '2020-06-16T18:18:31Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (9, 'jessica_pereira@gmail.com', 'Jessica', 46, TIMESTAMP WITH TIME ZONE '2020-06-22T14:39:55Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (7, 'jose.antonio@gmail.com', 'Jose', 22, TIMESTAMP WITH TIME ZONE '2020-07-22T16:49:11Z');
INSERT INTO record (game_id, email, name, age, moment) VALUES (7, 'adrian.ribeiro@gmail.com', 'Adrian', 25, TIMESTAMP WITH TIME ZONE '2020-06-06T06:48:33Z');
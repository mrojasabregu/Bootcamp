# Trabajos prácticos

## Enunciado 1:


### Description:

Un cliente nos ha solicitado crear servicios similar a Spotify.



### Entidades

#### Artist
- idArtist
- name
- genre
- image

#### Album
- idAlbum
- idArtist
- name

#### track
 -   id
 -   name
 -   idArtist
 -   idAlbum
 -   reproduction
 -   duration


1. GET /spotify/play/song/{songId}
2. GET GetPopularSongsByArtist, :idArtista
3. GET GetPopularArtist



### Acceptance Criteria
1. Crear el swagger de los endpoints que se van a implementar
    - POST /artist
    - PUT /artist/{artistId}
    - GET /artist/{artistId}
    - DELETE /artist/{artistId}
   - POST /album
   - PUT /album/{albumId}
   - GET /album/{albumId}
   - DELETE /album/{artistId}
   - POST /track
   - PUT /track/{trackId}
   - GET /track/{trackId}
   - DELETE /track/{artistId}
   - GET /spotify/play/song/{songId}
   - GET /GetPopularSongsByArtist 
   - GET /GetPopularArtist
    
2. Crear un nuevo proyecto llamado spotify
3. Realizar la implementacion con springboot


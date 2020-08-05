if sdk version >= 24
	initialize Exoplayer in onStart() lifecycle method
else
	initialize Exoplayer in onResume() lifecycle method

if sdk version >= 24
	release Exoplayer in onStop() lifecycle method
else
	initialize Exoplayer in onPause() lifecycle method

fun initializePlayer() {
	if exoplayer is null
		create an instance of exoplayer
	add player to playerView ui component
	create a media source using the media uri
	configure player
}

fun releasePlayer() {
	store player configuration for future use
	release resources by releasing player
}

add "fastforward_increment" and "rewind_increment" attribute in PlayerView in xml file and set to desired value in milisecond. This will take care of forward and rewind functionality of the player.


Design pattern:

Factory pattern will be used to create the player and media source instance.

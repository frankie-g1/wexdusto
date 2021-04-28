It's harder and harder to find an invasion in the game and players forced to jump across the locations and spam Red Eye Orb hoping to invade somebody.
This mod does this annoying stuff for you - it requests info about the players in your current matchmaking range from the servers and tries to invade in locations with the biggest amount of the hosts.

The item is called "Wex Dust" and you can buy it from the Shrine Handmaid. It replaces Repair Powder but Moonlight Greatsword users don't need to worry, Repair Powder transforms into Wex Dust only when you are online and alone in your world. If you are invading or being invaded or hosting with phantoms or offline, Repair Powder stays as it is so you can repair your equipment.

Wex Dust is used exactly like Red Eye Orb, each usage toggles the search on or off.
It also will try not to send you to the exact same area you just invaded. For example, if there are people in Anor Londo, Ringed City and Snowfield and you just returned from invading Anor Londo, it will try to match you with people at Ringed City and Snowfield first.
Wex tries to invade areas with the hosts in your matchmaking range only.
If you use Wex and it does nothing, it means there is literally nobody in your range in the whole game at this moment.
If you use Wex and it stuck searching one place, it means only that place has potential match.

Every precaution was taken to avoid tripping anti-cheat and several people played with the mod before the release, none of them were banned. Nobody reported being banned for it since the release too. Please note I'm not saying "it's safe, it won't ban you". All I can do is research, code and test. Nobody can't guarantee safety except developers.

This is pure "quality of life" thing, something that could've been built-in in the game. It does not give any unfair advantages in a fight, it doesn't do anything a player can't do, it just reduces time needed to find an invasion.
However, it allows to invade any location without obtaining necessary key items. For example, you can create new character, progress to Firelink, buy this item, use it, and invade Grand Archives if there is someone in your matchmaking range there. Just to be clear, it won't allow to invade a boss room or some other uninvadable area.

Short trailer https://youtu.be/RKReNC7TEhY
Installation video https://youtu.be/eHXau-cSUfE
Download the mod at https://www.nexusmods.com/darksouls3/mods/405

Installation:
Place "dinput8.dll" file to the Dark Souls 3 game folder (the directory with DarkSoulsIII.exe).
Usually it is "C:\Program Files (x86)\Steam\steamapps\common\DARK SOULS III\Game", you can find your path by right clicking on the game in Steam client and going to
"Properties -> Local files -> Browse local files".
When updating just replace "dinput8.dll" file and restart the game.
Compatible with wonderful DS3 PVP Watchdog mod.

Uninstallation:
Remove all wex files from the game folder when the game is not running.
Wex Dust doesn't modify save files, it's safe to uninstall at any point.

Configuration:
This is optional step, if defaults satisfy you, there is no need to do it.
If you make changes in config file, restart the game for the changes to take effect.
Place "wex_dust_config.txt" file to the Dark Souls 3 game folder (the directory with DarkSoulsIII.exe).

"area_blocklist" - list of area codes where Wex Dust shouldn't search for invasions.
Value - [area_code1, area_code2, ...]
Area codes listed at the bottom of readme file.

"ask_confirmation" - whether to show "Invade another world? Ok/Cancel" dialog or not.
Value - true or false

Example with blocked Swamps and Gank City and starting search without showing the dialog:
{
  "area_blocklist": [330011, 330012, 330013, 330014, 330015, 370010, 370011, 370012],
  "ask_confirmation": false
}


Ask questions here https://www.nexusmods.com/darksouls3/mods/405?tab=posts
Report bugs here https://www.nexusmods.com/darksouls3/mods/405?tab=bugs
Read existing comments and bugs before posting.


FAQ:
Q: Will you do Wex Dust for consoles?
A: No

Q: Can you use some other item for replacement, not Repair Powder?
A: No

Q: Will you do similar mod for blues?
A: No


Credits:
Created by ametalon
Huge thanks to LukeYui, it wouldn't be possible without you.
Thanks to awesome people from ?ServerName? and especially Pav
Thanks for help with testing and translation to Gáté, Firat, racuszek19, inuNorii, mare, alexmagnum, zir, DeividMartini, Kingshrimp3, BigbossShligo, kairos, Vmbra
Nexus cover by Jesuinox Cienfuegos

Changelog:
1.4:
Wex won't try to invade DLC areas if DLC isn't installed
Added French translation
Minor changes, Wex now should work on older computers too

1.3:
Made Filianore's Rest uninvadable, for realsies this time
Added Portuguese (BR) translation

1.2:
Added configurable area blocklist
Increased frequency of Red Eye Orb invasion requests, there is no need to spam it anymore
Made Filianore's Rest uninvadable
Added Korean translation
Minor fixes

1.1:
Wex Dust reverts to Repair Powder while in an invasion
Shows "Invade yes/no" dialog when using Wex Dust
Shows the message with the name of a location where a player is invading
Fixed stopping search after "unable to invade"
Tries to invade different areas before checking the last one invaded
Added Spanish translation. Vamos, muchachos! Wex Dust now comes in English, Russian, Italian, German, Polish and Spanish.


Invadable area codes:

Cemetery of Ash
400001:Untended Graves

High Wall of Lothric
300001:Top High Wall
300002:Darkwraith Chamber
300003:Middle High Wall
300004:Lower High Wall
300020:Consumed King's Garden
300021:Consumed King's Garden Main Area
300022:Pre-Oceiros

Undead Settlement
310000:Foot of the High Wall
310001:Dilapidated Bridge
310002:Cliff Underside
310003:Irina

Road of Sacrifices
330001:Halfway fortress
330002:Black Knight
330011:Keep Ruins
330012:Swamp
330013:Pre-Abyss Watchers
330014:Farron Keep Perimeter
330015:Old Wolf of Farron

Cathedral of the Deep
350001:Cleansing Chapel
350002:Below Chapel
350003:Outside Cathedral Door
350004:Cathedral of the Deep
350005:Pre-Deacons
350011:Pre-Rosaria

Catacombs of Carthus
380001:Post-Abyss Watchers
380002:Catacombs of Carthus
380012:Abandoned Tomb
380013:Horace's cave
380014:Giant Avelyn
380015:Old King's Antechamber
380016:Unknown

Irithyll of the Boreal Valley
370001:Central Irithyll
370002:Church of Yorshka
370003:Distant Manor
370004:Siegward's Fireplace
370005:Pre-Pontiff
370010:Pontiff Hotspot
370011:Darkmoon Tomb
370012:Anor Londo

Irithyll Dungeon
390000:Irithyll Dungeon
390001:Sleeping Giant
390002:Lower Dungeon
390003:Profaned Capital
390004:Pre-Yhorm

Lothric Castle
301000:Lothric Castle
301001:Dragon Barracks
301002:Lower Barracks
301003:Altar of Sunlight
341000:Grand Archives
341001:Grand Archives Rooftops
341002:Post-Trio
341003:Grand Archives Rooftop

Archdragon Peak
320001:Archdragon Peak
320010:Dragon-kin Mausoleum
320012:Second Wyvern
320013:Great Belfry

Kiln of the First Flame
410001:Kiln of the First Flame

The Painted World of Ariandel
450001:Snowfield
450002:Corvian Settlement
450003:Snowy Mountain Pass
450004:Unknown
450005:Ariandel Chapel
450006:Unknown
450011:Depths of the Painting

The Dreg Heap
500001:The Dreg Heap
500002:Earthen Peak Ruins
500003:Within the Earthen Peak Ruins

The Ringed City
510001:Mausoleum Lookout
510002:Ringed Inner Wall
510003:Ringed City Streets
510004:Shared Grave
510005:After Bridge
510011:Pre-Midir
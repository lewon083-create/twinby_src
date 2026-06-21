package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f37140a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static px a(int i, lb2 lb2Var) {
        int iB = lb2Var.b();
        if (lb2Var.b() == 1684108385) {
            lb2Var.e(lb2Var.f40464b + 8);
            String strB = lb2Var.b(iB - 16);
            return new px("und", strB, strB);
        }
        kh1.d("MetadataUtil", "Failed to parse comment attribute: " + xj.a(i));
        return null;
    }

    public static bd1 b(int i, lb2 lb2Var) {
        String strB = null;
        String strB2 = null;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int i12 = lb2Var.f40464b;
            if (i12 >= i) {
                break;
            }
            int iB = lb2Var.b();
            int iB2 = lb2Var.b();
            lb2Var.e(lb2Var.f40464b + 4);
            if (iB2 == 1835360622) {
                strB = lb2Var.b(iB - 12);
            } else if (iB2 == 1851878757) {
                strB2 = lb2Var.b(iB - 12);
            } else {
                if (iB2 == 1684108385) {
                    i10 = i12;
                    i11 = iB;
                }
                lb2Var.e(lb2Var.f40464b + (iB - 12));
            }
        }
        if (strB == null || strB2 == null || i10 == -1) {
            return null;
        }
        lb2Var.e(i10);
        lb2Var.e(lb2Var.f40464b + 16);
        return new bd1(strB, strB2, lb2Var.b(i11 - 16));
    }

    public static ag a(lb2 lb2Var) {
        String str;
        int iB = lb2Var.b();
        if (lb2Var.b() == 1684108385) {
            int iB2 = lb2Var.b() & 16777215;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                mf1.a("Unrecognized cover art flags: ", iB2, "MetadataUtil");
                return null;
            }
            lb2Var.e(lb2Var.f40464b + 4);
            int i = iB - 16;
            byte[] bArr = new byte[i];
            lb2Var.a(bArr, 0, i);
            return new ag(str, null, 3, bArr);
        }
        kh1.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static b63 b(int i, lb2 lb2Var, String str) {
        int iB = lb2Var.b();
        if (lb2Var.b() == 1684108385) {
            lb2Var.e(lb2Var.f40464b + 8);
            return new b63(str, null, lb2Var.b(iB - 16));
        }
        kh1.d("MetadataUtil", "Failed to parse text attribute: " + xj.a(i));
        return null;
    }

    public static b63 a(int i, lb2 lb2Var, String str) {
        int iB = lb2Var.b();
        if (lb2Var.b() == 1684108385 && iB >= 22) {
            lb2Var.e(lb2Var.f40464b + 10);
            int iR = lb2Var.r();
            if (iR > 0) {
                String strA = og2.a("", iR);
                int iR2 = lb2Var.r();
                if (iR2 > 0) {
                    strA = strA + "/" + iR2;
                }
                return new b63(str, null, strA);
            }
        }
        kh1.d("MetadataUtil", "Failed to parse index/count attribute: " + xj.a(i));
        return null;
    }

    public static w21 a(int i, String str, lb2 lb2Var, boolean z5, boolean z10) {
        int iMin;
        lb2Var.e(lb2Var.f40464b + 4);
        if (lb2Var.b() == 1684108385) {
            lb2Var.e(lb2Var.f40464b + 8);
            iMin = lb2Var.m();
        } else {
            kh1.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z10) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            if (z5) {
                return new b63(str, null, Integer.toString(iMin));
            }
            return new px("und", str, Integer.toString(iMin));
        }
        kh1.d("MetadataUtil", "Failed to parse uint8 attribute: " + xj.a(i));
        return null;
    }
}

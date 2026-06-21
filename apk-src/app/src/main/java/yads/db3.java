package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class db3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cb3 f37692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final db3 f37693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final db3 f37694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final db3 f37695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final db3 f37696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ db3[] f37697h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37698b;

    static {
        db3 db3Var = new db3(0, "SMS_SCHEME", "sms:");
        db3 db3Var2 = new db3(1, "MAIL_SCHEME", "mailto:");
        db3 db3Var3 = new db3(2, "VOICE_MAIL_SCHEME", "voicemail:");
        db3 db3Var4 = new db3(3, "TEL_SCHEME", "tel:");
        db3 db3Var5 = new db3(4, "CALLTO", "callto:");
        db3 db3Var6 = new db3(5, "FAX", "fax:");
        db3 db3Var7 = new db3(6, "GEO_SCHEME", "geo:");
        db3 db3Var8 = new db3(7, "MAP_SCHEME", "map:");
        db3 db3Var9 = new db3(8, "MAPS_SCHEME", "maps:");
        db3 db3Var10 = new db3(9, "GOOGLE_MARKET_SCHEME", "market:");
        f37693d = db3Var10;
        db3 db3Var11 = new db3(10, "GOOGLE_PLAY_SCHEME", "play:");
        f37694e = db3Var11;
        db3 db3Var12 = new db3(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
        db3 db3Var13 = new db3(12, "GOOGLE_MARKET_HOST", "market.android");
        f37695f = db3Var13;
        db3 db3Var14 = new db3(13, "GOOGLE_PLAY_HOST", "play.google");
        f37696g = db3Var14;
        db3[] db3VarArr = {db3Var, db3Var2, db3Var3, db3Var4, db3Var5, db3Var6, db3Var7, db3Var8, db3Var9, db3Var10, db3Var11, db3Var12, db3Var13, db3Var14, new db3(14, "MAP_HOST", "map"), new db3(15, "MAPS_HOST", "maps"), new db3(16, "MOBMAPS", "mobile.maps"), new db3(17, "SHORTMOBMAPS", "m.maps"), new db3(18, "MESSAGE", "message:"), new db3(19, "SIP", "sip:"), new db3(20, "SKYPE", "skype:"), new db3(21, "SMS", "sms:"), new db3(22, "GTALK", "gtalk:"), new db3(23, "SPOTIFY", "spotify:"), new db3(24, "LASTFM", "lastfm:")};
        f37697h = db3VarArr;
        hl.d.k(db3VarArr);
        f37692c = new cb3();
    }

    public db3(int i, String str, String str2) {
        this.f37698b = str2;
    }

    public static db3 valueOf(String str) {
        return (db3) Enum.valueOf(db3.class, str);
    }

    public static db3[] values() {
        return (db3[]) f37697h.clone();
    }
}

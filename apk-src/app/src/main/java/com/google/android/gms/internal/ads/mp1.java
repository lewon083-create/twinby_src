package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mp1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mp1 f7989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mp1 f7990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mp1 f7991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mp1[] f7992g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np1 f7993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7994c;

    /* JADX INFO: Fake field, exist only in values array */
    mp1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    mp1 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    mp1 EF0;

    static {
        mp1 mp1Var = new mp1("DOUBLE", 0, np1.f8422e, 1);
        mp1 mp1Var2 = new mp1("FLOAT", 1, np1.f8421d, 5);
        np1 np1Var = np1.f8420c;
        mp1 mp1Var3 = new mp1("INT64", 2, np1Var, 0);
        mp1 mp1Var4 = new mp1("UINT64", 3, np1Var, 0);
        np1 np1Var2 = np1.f8419b;
        mp1 mp1Var5 = new mp1("INT32", 4, np1Var2, 0);
        mp1 mp1Var6 = new mp1("FIXED64", 5, np1Var, 1);
        mp1 mp1Var7 = new mp1("FIXED32", 6, np1Var2, 5);
        mp1 mp1Var8 = new mp1("BOOL", 7, np1.f8423f, 0);
        mp1 mp1Var9 = new mp1("STRING", 8, np1.f8424g, 2);
        f7989d = mp1Var9;
        np1 np1Var3 = np1.f8426j;
        mp1 mp1Var10 = new mp1("GROUP", 9, np1Var3, 3);
        f7990e = mp1Var10;
        mp1 mp1Var11 = new mp1("MESSAGE", 10, np1Var3, 2);
        f7991f = mp1Var11;
        f7992g = new mp1[]{mp1Var, mp1Var2, mp1Var3, mp1Var4, mp1Var5, mp1Var6, mp1Var7, mp1Var8, mp1Var9, mp1Var10, mp1Var11, new mp1("BYTES", 11, np1.f8425h, 2), new mp1("UINT32", 12, np1Var2, 0), new mp1("ENUM", 13, np1.i, 0), new mp1("SFIXED32", 14, np1Var2, 5), new mp1("SFIXED64", 15, np1Var, 1), new mp1("SINT32", 16, np1Var2, 0), new mp1("SINT64", 17, np1Var, 0)};
    }

    public mp1(String str, int i, np1 np1Var, int i10) {
        this.f7993b = np1Var;
        this.f7994c = i10;
    }

    public static mp1[] values() {
        return (mp1[]) f7992g.clone();
    }
}

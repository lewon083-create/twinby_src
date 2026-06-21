package com.google.android.gms.internal.measurement;

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
public final class y6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y6 f14100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y6 f14101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y6[] f14102f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z6 f14103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14104c;

    /* JADX INFO: Fake field, exist only in values array */
    y6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    y6 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    y6 EF0;

    static {
        y6 y6Var = new y6("DOUBLE", 0, z6.f14122e, 1);
        y6 y6Var2 = new y6("FLOAT", 1, z6.f14121d, 5);
        z6 z6Var = z6.f14120c;
        y6 y6Var3 = new y6("INT64", 2, z6Var, 0);
        y6 y6Var4 = new y6("UINT64", 3, z6Var, 0);
        z6 z6Var2 = z6.f14119b;
        y6 y6Var5 = new y6("INT32", 4, z6Var2, 0);
        y6 y6Var6 = new y6("FIXED64", 5, z6Var, 1);
        y6 y6Var7 = new y6("FIXED32", 6, z6Var2, 5);
        y6 y6Var8 = new y6("BOOL", 7, z6.f14123f, 0);
        y6 y6Var9 = new y6("STRING", 8, z6.f14124g, 2);
        f14100d = y6Var9;
        z6 z6Var3 = z6.f14126j;
        y6 y6Var10 = new y6("GROUP", 9, z6Var3, 3);
        f14101e = y6Var10;
        f14102f = new y6[]{y6Var, y6Var2, y6Var3, y6Var4, y6Var5, y6Var6, y6Var7, y6Var8, y6Var9, y6Var10, new y6("MESSAGE", 10, z6Var3, 2), new y6("BYTES", 11, z6.f14125h, 2), new y6("UINT32", 12, z6Var2, 0), new y6("ENUM", 13, z6.i, 0), new y6("SFIXED32", 14, z6Var2, 5), new y6("SFIXED64", 15, z6Var, 1), new y6("SINT32", 16, z6Var2, 0), new y6("SINT64", 17, z6Var, 0)};
    }

    public y6(String str, int i, z6 z6Var, int i10) {
        this.f14103b = z6Var;
        this.f14104c = i10;
    }

    public static y6[] values() {
        return (y6[]) f14102f.clone();
    }
}

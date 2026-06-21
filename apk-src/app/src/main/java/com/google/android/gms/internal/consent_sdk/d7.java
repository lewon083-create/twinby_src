package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
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
public final class d7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d7 f13361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d7 f13362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d7 f13363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d7[] f13364g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7 f13365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13366c;

    /* JADX INFO: Fake field, exist only in values array */
    d7 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    d7 EF2;

    static {
        d7 d7Var = new d7("DOUBLE", 0, e7.f13376e, 1);
        d7 d7Var2 = new d7("FLOAT", 1, e7.f13375d, 5);
        e7 e7Var = e7.f13374c;
        d7 d7Var3 = new d7("INT64", 2, e7Var, 0);
        f13361d = d7Var3;
        d7 d7Var4 = new d7("UINT64", 3, e7Var, 0);
        e7 e7Var2 = e7.f13373b;
        d7 d7Var5 = new d7("INT32", 4, e7Var2, 0);
        d7 d7Var6 = new d7("FIXED64", 5, e7Var, 1);
        d7 d7Var7 = new d7("FIXED32", 6, e7Var2, 5);
        d7 d7Var8 = new d7("BOOL", 7, e7.f13377f, 0);
        d7 d7Var9 = new d7("STRING", 8, e7.f13378g, 2);
        f13362e = d7Var9;
        e7 e7Var3 = e7.f13380j;
        d7 d7Var10 = new d7("GROUP", 9, e7Var3, 3);
        f13363f = d7Var10;
        f13364g = new d7[]{d7Var, d7Var2, d7Var3, d7Var4, d7Var5, d7Var6, d7Var7, d7Var8, d7Var9, d7Var10, new d7("MESSAGE", 10, e7Var3, 2), new d7("BYTES", 11, e7.f13379h, 2), new d7("UINT32", 12, e7Var2, 0), new d7("ENUM", 13, e7.i, 0), new d7("SFIXED32", 14, e7Var2, 5), new d7("SFIXED64", 15, e7Var, 1), new d7("SINT32", 16, e7Var2, 0), new d7("SINT64", 17, e7Var, 0)};
    }

    public d7(String str, int i, e7 e7Var, int i10) {
        this.f13365b = e7Var;
        this.f13366c = i10;
    }

    public static d7[] values() {
        return (d7[]) f13364g.clone();
    }
}

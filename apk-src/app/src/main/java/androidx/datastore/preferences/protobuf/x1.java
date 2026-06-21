package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1 f1504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u1 f1505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v1 f1506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x1[] f1507g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f1508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1509c;

    /* JADX INFO: Fake field, exist only in values array */
    x1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    x1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    x1 EF2;

    static {
        x1 x1Var = new x1("DOUBLE", 0, y1.f1513e, 1);
        x1 x1Var2 = new x1("FLOAT", 1, y1.f1512d, 5);
        y1 y1Var = y1.f1511c;
        x1 x1Var3 = new x1("INT64", 2, y1Var, 0);
        x1 x1Var4 = new x1("UINT64", 3, y1Var, 0);
        y1 y1Var2 = y1.f1510b;
        x1 x1Var5 = new x1("INT32", 4, y1Var2, 0);
        x1 x1Var6 = new x1("FIXED64", 5, y1Var, 1);
        x1 x1Var7 = new x1("FIXED32", 6, y1Var2, 5);
        x1 x1Var8 = new x1("BOOL", 7, y1.f1514f, 0);
        t1 t1Var = new t1("STRING", 8, y1.f1515g, 2);
        f1504d = t1Var;
        y1 y1Var3 = y1.f1517j;
        u1 u1Var = new u1("GROUP", 9, y1Var3, 3);
        f1505e = u1Var;
        v1 v1Var = new v1("MESSAGE", 10, y1Var3, 2);
        f1506f = v1Var;
        f1507g = new x1[]{x1Var, x1Var2, x1Var3, x1Var4, x1Var5, x1Var6, x1Var7, x1Var8, t1Var, u1Var, v1Var, new w1("BYTES", 11, y1.f1516h, 2), new x1("UINT32", 12, y1Var2, 0), new x1("ENUM", 13, y1.i, 0), new x1("SFIXED32", 14, y1Var2, 5), new x1("SFIXED64", 15, y1Var, 1), new x1("SINT32", 16, y1Var2, 0), new x1("SINT64", 17, y1Var, 0)};
    }

    public x1(String str, int i, y1 y1Var, int i10) {
        this.f1508b = y1Var;
        this.f1509c = i10;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f1507g.clone();
    }
}

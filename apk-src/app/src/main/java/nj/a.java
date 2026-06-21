package nj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f29515e;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f29512b = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f29513c = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f29514d = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f29515e = aVarArr;
        hl.d.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f29515e.clone();
    }
}

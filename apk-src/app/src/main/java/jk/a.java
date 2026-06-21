package jk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f26678e;

    static {
        a aVar = new a("SUSPEND", 0);
        f26675b = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f26676c = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f26677d = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f26678e = aVarArr;
        hl.d.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f26678e.clone();
    }
}

package ml;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f28954f;

    static {
        a aVar = new a("NONE", 0);
        f28950b = aVar;
        a aVar2 = new a("BASIC", 1);
        f28951c = aVar2;
        a aVar3 = new a("HEADERS", 2);
        f28952d = aVar3;
        a aVar4 = new a("BODY", 3);
        f28953e = aVar4;
        f28954f = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28954f.clone();
    }
}

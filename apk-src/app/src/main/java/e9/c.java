package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f16300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f16301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f16302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f16303e;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f16300b = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f16301c = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f16302d = cVar3;
        f16303e = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f16303e.clone();
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ch f37393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ch f37394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ch f37395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ch[] f37396e;

    static {
        ch chVar = new ch(0, "UNKNOWN");
        f37393b = chVar;
        ch chVar2 = new ch(1, "NETWORK");
        f37394c = chVar2;
        ch chVar3 = new ch(2, "INVALID_RESPONSE");
        f37395d = chVar3;
        ch[] chVarArr = {chVar, chVar2, chVar3};
        f37396e = chVarArr;
        hl.d.k(chVarArr);
    }

    public ch(int i, String str) {
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) f37396e.clone();
    }
}

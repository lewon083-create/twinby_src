package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bh2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bh2 f37027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bh2 f37028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bh2 f37029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bh2 f37030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ bh2[] f37031h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37033c;

    static {
        bh2 bh2Var = new bh2(0, 1001, "TIMEOUT", "The request failed to load due to a timeout");
        f37027d = bh2Var;
        bh2 bh2Var2 = new bh2(1, 1002, "INVALID_CONFIGURATION", "The provided configuration is invalid");
        f37028e = bh2Var2;
        bh2 bh2Var3 = new bh2(2, 1003, "EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected");
        f37029f = bh2Var3;
        bh2 bh2Var4 = new bh2(3, VKApiCodes.CODE_PHONE_ALREADY_USED, "INVALID_FETCHED_DATA", "The fetched data is invalid");
        f37030g = bh2Var4;
        bh2[] bh2VarArr = {bh2Var, bh2Var2, bh2Var3, bh2Var4};
        f37031h = bh2VarArr;
        hl.d.k(bh2VarArr);
    }

    public bh2(int i, int i10, String str, String str2) {
        this.f37032b = i10;
        this.f37033c = str2;
    }

    public static bh2 valueOf(String str) {
        return (bh2) Enum.valueOf(bh2.class, str);
    }

    public static bh2[] values() {
        return (bh2[]) f37031h.clone();
    }

    public final int a() {
        return this.f37032b;
    }

    public final String b() {
        return this.f37033c;
    }
}

package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41502e;

    public o93(int i, int i10, int i11) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f41498a = str;
        this.f41499b = i10;
        this.f41500c = i11;
        this.f41501d = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f41502e = "";
    }

    public final void a() {
        int i = this.f41501d;
        this.f41501d = i == Integer.MIN_VALUE ? this.f41499b : i + this.f41500c;
        this.f41502e = this.f41498a + this.f41501d;
    }

    public final void b() {
        if (this.f41501d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}

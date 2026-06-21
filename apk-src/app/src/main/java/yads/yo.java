package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yo extends sa0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45133l;

    public yo() {
        super(2);
        this.f45133l = 32;
    }

    public final boolean a(sa0 sa0Var) {
        ByteBuffer byteBuffer;
        if (sa0Var.b(1073741824)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(268435456)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(4)) {
            throw new IllegalArgumentException();
        }
        int i = this.f45132k;
        if (i > 0) {
            if (i >= this.f45133l || sa0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
                return false;
            }
            ByteBuffer byteBuffer2 = sa0Var.f42864d;
            if (byteBuffer2 != null && (byteBuffer = this.f42864d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f45132k;
        this.f45132k = i10 + 1;
        if (i10 == 0) {
            this.f42866f = sa0Var.f42866f;
            if (sa0Var.b(1)) {
                this.f43049b = 1;
            }
        }
        if (sa0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
            this.f43049b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        ByteBuffer byteBuffer3 = sa0Var.f42864d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f42864d.put(byteBuffer3);
        }
        this.f45131j = sa0Var.f42866f;
        return true;
    }

    @Override // yads.sa0
    public final void b() {
        super.b();
        this.f45132k = 0;
    }
}

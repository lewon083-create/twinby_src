package a0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f176c;

    public o1(int i, ByteBuffer byteBuffer) {
        this.f176c = i;
        this.f175b = byteBuffer;
    }

    @Override // a0.q1
    public final ByteBuffer e() {
        switch (this.f174a) {
        }
        return this.f175b;
    }

    @Override // a0.q1
    public final int f() {
        switch (this.f174a) {
        }
        return this.f176c;
    }

    @Override // a0.q1
    public final int g() {
        switch (this.f174a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public o1(ByteBuffer byteBuffer, int i) {
        this.f175b = byteBuffer;
        this.f176c = i;
    }
}

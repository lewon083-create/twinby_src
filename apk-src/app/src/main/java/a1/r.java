package a1;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f383d;

    public r(ByteBuffer byteBuffer, o oVar, int i, int i10) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != oVar.f373a) {
            StringBuilder sbM = l7.o.m(iLimit, "Byte buffer size is not match with packet info: ", " != ");
            sbM.append(oVar.f373a);
            throw new IllegalStateException(sbM.toString());
        }
        this.f380a = i;
        this.f381b = i10;
        this.f382c = byteBuffer;
        this.f383d = oVar.f374b;
    }

    public final o a(ByteBuffer byteBuffer) {
        int iRemaining;
        long j10 = this.f383d;
        ByteBuffer byteBuffer2 = this.f382c;
        int iPosition = byteBuffer2.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            iRemaining = byteBuffer.remaining();
            this.f383d += com.google.android.gms.internal.auth.m.g(this.f381b, com.google.android.gms.internal.auth.m.z(this.f380a, iRemaining));
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
            byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
        } else {
            iRemaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
        }
        byteBuffer2.position(iPosition + iRemaining);
        return new o(iRemaining, j10);
    }
}

package u3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends k3.l {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // k3.k
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f26867b.f26862c;
        if (i11 == 2) {
            byteBufferJ = j(i10 * 2);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferJ);
                iPosition += 2;
            }
        } else if (i11 == 1342177280) {
            byteBufferJ = j((i10 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i11 == 1610612736) {
            byteBufferJ = j(i10);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i11 == 21) {
            byteBufferJ = j((i10 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i11 != 22) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i10);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // k3.l
    public final k3.h f(k3.h hVar) throws k3.j {
        int i10 = hVar.f26862c;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4 || i10 == 2) {
            return i10 != 4 ? new k3.h(hVar.f26860a, hVar.f26861b, 4) : k3.h.f26859e;
        }
        throw new k3.j(hVar);
    }
}

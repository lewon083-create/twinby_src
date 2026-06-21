package u2;

import com.google.firebase.messaging.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f34040d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f34042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f34043c = 0;

    public k(y yVar, int i) {
        this.f34042b = yVar;
        this.f34041a = i;
    }

    public final int a(int i) {
        v2.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f19839e;
        int i10 = iA + aVarB.f19836b;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final v2.a b() {
        ThreadLocal threadLocal = f34040d;
        v2.a aVar = (v2.a) threadLocal.get();
        if (aVar == null) {
            aVar = new v2.a();
            threadLocal.set(aVar);
        }
        v2.b bVar = (v2.b) this.f34042b.f14899b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f19836b;
            int i10 = (this.f34041a * 4) + ((ByteBuffer) bVar.f19839e).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) bVar.f19839e).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f19839e;
            aVar.f19839e = byteBuffer;
            if (byteBuffer != null) {
                aVar.f19836b = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f19837c = i12;
                aVar.f19838d = ((ByteBuffer) aVar.f19839e).getShort(i12);
                return aVar;
            }
            aVar.f19836b = 0;
            aVar.f19837c = 0;
            aVar.f19838d = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        v2.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f19839e).getInt(iA + aVarB.f19836b) : 0));
        sb2.append(", codepoints:");
        v2.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f19836b;
            i = ((ByteBuffer) aVarB2.f19839e).getInt(((ByteBuffer) aVarB2.f19839e).getInt(i10) + i10);
        } else {
            i = 0;
        }
        for (int i11 = 0; i11 < i; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

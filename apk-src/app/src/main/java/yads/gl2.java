package yads;

import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gl2 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static fl2 a(byte[] bArr) {
        lb2 lb2Var = new lb2(bArr);
        if (lb2Var.f40465c < 32) {
            return null;
        }
        lb2Var.e(0);
        if (lb2Var.b() != (lb2Var.f40465c - lb2Var.f40464b) + 4 || lb2Var.b() != 1886614376) {
            return null;
        }
        int iB = (lb2Var.b() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (iB > 1) {
            mf1.a("Unsupported pssh version: ", iB, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(lb2Var.i(), lb2Var.i());
        if (iB == 1) {
            lb2Var.e(lb2Var.f40464b + (lb2Var.p() * 16));
        }
        int iP = lb2Var.p();
        if (iP != lb2Var.f40465c - lb2Var.f40464b) {
            return null;
        }
        byte[] bArr2 = new byte[iP];
        lb2Var.a(bArr2, 0, iP);
        return new fl2(uuid, iB, bArr2);
    }
}

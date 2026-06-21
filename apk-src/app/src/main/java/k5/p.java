package k5;

import ad.g0;
import ad.h0;
import ad.j0;
import com.google.android.gms.internal.ads.kv0;
import j3.a0;
import j3.b0;
import j3.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26993a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

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
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static String b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z5 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((s) it.next()).f27010a.f27000g.f26335n;
            if (c0.m(str2)) {
                return "video/mp4";
            }
            if (c0.i(str2)) {
                z5 = true;
            } else if (c0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z5 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean c(int i, boolean z5) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z5) {
            return true;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (f26993a[i10] == i) {
                return true;
            }
        }
        return false;
    }

    public static e5.e d(int i, m3.p pVar) {
        int iM = pVar.m();
        if (pVar.m() == 1684108385) {
            pVar.N(8);
            String strV = pVar.v(iM - 16);
            return new e5.e("und", strV, strV);
        }
        m3.b.s("MetadataUtil", "Failed to parse comment attribute: " + kv0.b(i));
        return null;
    }

    public static e5.a e(m3.p pVar) {
        int iM = pVar.m();
        if (pVar.m() != 1684108385) {
            m3.b.s("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = pVar.m();
        byte[] bArr = c.f26902a;
        int i = iM2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            gf.a.p(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        pVar.N(4);
        int i10 = iM - 16;
        byte[] bArr2 = new byte[i10];
        pVar.k(bArr2, 0, i10);
        return new e5.a(str, null, 3, bArr2);
    }

    public static e5.o f(int i, String str, m3.p pVar) {
        int iM = pVar.m();
        if (pVar.m() == 1684108385 && iM >= 22) {
            pVar.N(10);
            int iG = pVar.G();
            if (iG > 0) {
                String strI = l7.o.i(iG, "");
                int iG2 = pVar.G();
                if (iG2 > 0) {
                    strI = strI + "/" + iG2;
                }
                return new e5.o(str, null, j0.w(strI));
            }
        }
        m3.b.s("MetadataUtil", "Failed to parse index/count attribute: " + kv0.b(i));
        return null;
    }

    public static int g(m3.p pVar) {
        int iM = pVar.m();
        if (pVar.m() == 1684108385) {
            pVar.N(8);
            int i = iM - 16;
            if (i == 1) {
                return pVar.z();
            }
            if (i == 2) {
                return pVar.G();
            }
            if (i == 3) {
                return pVar.C();
            }
            if (i == 4 && (pVar.j() & 128) == 0) {
                return pVar.D();
            }
        }
        m3.b.s("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static e5.j h(int i, String str, m3.p pVar, boolean z5, boolean z10) {
        int iG = g(pVar);
        if (z10) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z5 ? new e5.o(str, null, j0.w(Integer.toString(iG))) : new e5.e("und", str, Integer.toString(iG));
        }
        m3.b.s("MetadataUtil", "Failed to parse uint8 attribute: " + kv0.b(i));
        return null;
    }

    public static fe.c i(byte[] bArr) {
        UUID[] uuidArr;
        m3.p pVar = new m3.p(bArr);
        if (pVar.f28591c < 32) {
            return null;
        }
        pVar.M(0);
        int iA = pVar.a();
        int iM = pVar.m();
        if (iM != iA) {
            m3.b.s("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = pVar.m();
        if (iM2 != 1886614376) {
            gf.a.p(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = c.e(pVar.m());
        if (iE > 1) {
            gf.a.p(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(pVar.t(), pVar.t());
        if (iE == 1) {
            int iD = pVar.D();
            uuidArr = new UUID[iD];
            for (int i = 0; i < iD; i++) {
                uuidArr[i] = new UUID(pVar.t(), pVar.t());
            }
        } else {
            uuidArr = null;
        }
        int iD2 = pVar.D();
        int iA2 = pVar.a();
        if (iD2 == iA2) {
            byte[] bArr2 = new byte[iD2];
            pVar.k(bArr2, 0, iD2);
            return new fe.c(uuid, iE, bArr2, uuidArr);
        }
        m3.b.s("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static e5.o j(int i, String str, m3.p pVar) {
        int iM = pVar.m();
        if (pVar.m() == 1684108385) {
            pVar.N(8);
            return new e5.o(str, null, j0.w(pVar.v(iM - 16)));
        }
        m3.b.s("MetadataUtil", "Failed to parse text attribute: " + kv0.b(i));
        return null;
    }

    public static void k(int i, b0 b0Var, j3.n nVar, b0 b0Var2, b0... b0VarArr) {
        if (b0Var2 == null) {
            b0Var2 = new b0(new a0[0]);
        }
        if (b0Var != null) {
            g0 g0VarQ = j0.q();
            for (a0 a0Var : b0Var.f26216a) {
                if (n3.a.class.isAssignableFrom(a0Var.getClass())) {
                    g0VarQ.b((a0) n3.a.class.cast(a0Var));
                }
            }
            h0 h0VarListIterator = g0VarQ.g().listIterator(0);
            while (h0VarListIterator.hasNext()) {
                n3.a aVar = (n3.a) h0VarListIterator.next();
                if (!aVar.f29035a.equals("com.android.capture.fps") || i == 2) {
                    b0Var2 = b0Var2.a(aVar);
                }
            }
        }
        for (b0 b0Var3 : b0VarArr) {
            b0Var2 = b0Var2.b(b0Var3);
        }
        if (b0Var2.f26216a.length > 0) {
            nVar.f26290k = b0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q4.x l(q4.l r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.p.l(q4.l, boolean, boolean):q4.x");
    }
}

package yads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gn3 {
    public static dn3 a(lb2 lb2Var, boolean z5, boolean z10) throws qb2 {
        if (z5) {
            a(3, lb2Var, false);
        }
        lb2Var.a((int) lb2Var.g(), bu.f37146c);
        long jG = lb2Var.g();
        String[] strArr = new String[(int) jG];
        for (int i = 0; i < jG; i++) {
            strArr[i] = lb2Var.a((int) lb2Var.g(), bu.f37146c);
        }
        if (z10 && (lb2Var.m() & 1) == 0) {
            throw new qb2("framing bit expected to be set", null, true, 1);
        }
        return new dn3(strArr);
    }

    public static fn3 a(lb2 lb2Var) throws qb2 {
        a(1, lb2Var, false);
        int iD = lb2Var.d();
        if (iD >= 0) {
            int iM = lb2Var.m();
            int iD2 = lb2Var.d();
            if (iD2 >= 0) {
                int iD3 = lb2Var.d();
                int i = iD3 <= 0 ? -1 : iD3;
                int iD4 = lb2Var.d();
                int i10 = iD4 <= 0 ? -1 : iD4;
                lb2Var.d();
                int iM2 = lb2Var.m();
                int iPow = (int) Math.pow(2.0d, iM2 & 15);
                int iPow2 = (int) Math.pow(2.0d, (iM2 & 240) >> 4);
                lb2Var.m();
                return new fn3(iM, iD2, i, i10, iPow, iPow2, Arrays.copyOf(lb2Var.f40463a, lb2Var.f40465c));
            }
            throw new IllegalStateException(og2.a("Top bit not zero: ", iD2));
        }
        throw new IllegalStateException(og2.a("Top bit not zero: ", iD));
    }

    public static boolean a(int i, lb2 lb2Var, boolean z5) throws qb2 {
        if (lb2Var.f40465c - lb2Var.f40464b < 7) {
            if (z5) {
                return false;
            }
            throw new qb2("too short header: " + (lb2Var.f40465c - lb2Var.f40464b), null, true, 1);
        }
        if (lb2Var.m() != i) {
            if (z5) {
                return false;
            }
            throw new qb2("expected header type " + Integer.toHexString(i), null, true, 1);
        }
        if (lb2Var.m() == 118 && lb2Var.m() == 111 && lb2Var.m() == 114 && lb2Var.m() == 98 && lb2Var.m() == 105 && lb2Var.m() == 115) {
            return true;
        }
        if (z5) {
            return false;
        }
        throw new qb2("expected characters 'vorbis'", null, true, 1);
    }

    public static vs1 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i10 = lb3.f40466a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                kh1.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    lb2 lb2Var = new lb2(Base64.decode(strArrSplit[1], 0));
                    int iB = lb2Var.b();
                    String strA = lb2Var.a(lb2Var.b(), bu.f37144a);
                    String strA2 = lb2Var.a(lb2Var.b(), bu.f37146c);
                    int iB2 = lb2Var.b();
                    int iB3 = lb2Var.b();
                    int iB4 = lb2Var.b();
                    int iB5 = lb2Var.b();
                    int iB6 = lb2Var.b();
                    byte[] bArr = new byte[iB6];
                    lb2Var.a(bArr, 0, iB6);
                    arrayList.add(new cd2(iB, strA, strA2, iB2, iB3, iB4, iB5, bArr));
                } catch (RuntimeException e3) {
                    kh1.d("VorbisUtil", kh1.a("Failed to parse vorbis picture", e3));
                }
            } else {
                arrayList.add(new zm3(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new vs1(arrayList);
    }
}

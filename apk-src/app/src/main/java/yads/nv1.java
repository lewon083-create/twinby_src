package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nv1 extends iz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb2 f41356m = new lb2();

    @Override // yads.iz2
    public final u43 a(byte[] bArr, int i, boolean z5) throws w43 {
        o20 o20VarA;
        lb2 lb2Var = this.f41356m;
        lb2Var.f40463a = bArr;
        lb2Var.f40465c = i;
        lb2Var.f40464b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            lb2 lb2Var2 = this.f41356m;
            int i10 = lb2Var2.f40465c - lb2Var2.f40464b;
            if (i10 <= 0) {
                return new ov1(arrayList);
            }
            if (i10 < 8) {
                throw new w43("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iB = lb2Var2.b();
            if (this.f41356m.b() == 1987343459) {
                lb2 lb2Var3 = this.f41356m;
                int i11 = iB - 8;
                CharSequence charSequenceA = null;
                n20 n20VarA = null;
                while (i11 > 0) {
                    if (i11 < 8) {
                        throw new w43("Incomplete vtt cue box header found.");
                    }
                    int iB2 = lb2Var3.b();
                    int iB3 = lb2Var3.b();
                    int i12 = iB2 - 8;
                    String strA = lb3.a(lb2Var3.f40463a, lb2Var3.f40464b, i12);
                    lb2Var3.e(lb2Var3.f40464b + i12);
                    i11 = (i11 - 8) - i12;
                    if (iB3 == 1937011815) {
                        so3 so3Var = new so3();
                        to3.a(strA, so3Var);
                        n20VarA = so3Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = to3.a(null, strA.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (n20VarA != null) {
                    n20VarA.f41137a = charSequenceA;
                    o20VarA = n20VarA.a();
                } else {
                    Pattern pattern = to3.f43391a;
                    so3 so3Var2 = new so3();
                    so3Var2.f43014c = charSequenceA;
                    o20VarA = so3Var2.a().a();
                }
                arrayList.add(o20VarA);
            } else {
                lb2 lb2Var4 = this.f41356m;
                lb2Var4.e(lb2Var4.f40464b + (iB - 8));
            }
        }
    }
}

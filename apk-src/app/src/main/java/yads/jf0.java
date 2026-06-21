package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jf0 implements n93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39850b;

    public jf0() {
        this(r51.g());
    }

    public final p93 a(int i, m93 m93Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new kc2(new pv1(m93Var.f40849a));
            }
            if (i == 21) {
                return new kc2(new y21());
            }
            if (i == 27) {
                if (a(4)) {
                    return null;
                }
                return new kc2(new m01(new qx2(a(m93Var)), a(1), a(8)));
            }
            if (i == 36) {
                return new kc2(new o01(new qx2(a(m93Var))));
            }
            if (i == 89) {
                return new kc2(new ql0(m93Var.f40850b));
            }
            if (i != 138) {
                if (i == 172) {
                    return new kc2(new j0(m93Var.f40849a));
                }
                if (i == 257) {
                    return new vw2(new wb2("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new vw2(new wb2("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (a(2)) {
                                return null;
                            }
                            return new kc2(new qc(m93Var.f40849a, false));
                        case 16:
                            return new kc2(new j01(new jb3(a(m93Var))));
                        case 17:
                            if (a(2)) {
                                return null;
                            }
                            return new kc2(new te1(m93Var.f40849a));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case VKApiCodes.CODE_INVALID_PHOTO_FORMAT /* 129 */:
                                    break;
                                case 130:
                                    if (!a(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new kc2(new g0(m93Var.f40849a));
            }
            return new kc2(new xk0(m93Var.f40849a));
        }
        return new kc2(new g01(new jb3(a(m93Var))));
    }

    public jf0(um2 um2Var) {
        this.f39849a = 0;
        this.f39850b = um2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List a(m93 m93Var) {
        String str;
        int i;
        List listSingletonList;
        if (a(32)) {
            return this.f39850b;
        }
        lb2 lb2Var = new lb2(m93Var.f40851c);
        ArrayList arrayList = this.f39850b;
        while (lb2Var.f40465c - lb2Var.f40464b > 0) {
            int iM = lb2Var.m();
            int iM2 = lb2Var.f40464b + lb2Var.m();
            if (iM == 134) {
                arrayList = new ArrayList();
                int iM3 = lb2Var.m() & 31;
                for (int i10 = 0; i10 < iM3; i10++) {
                    String strA = lb2Var.a(3, bu.f37146c);
                    int iM4 = lb2Var.m();
                    boolean z5 = (iM4 & 128) != 0;
                    if (z5) {
                        i = iM4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM = (byte) lb2Var.m();
                    lb2Var.e(lb2Var.f40464b + 1);
                    if (z5) {
                        listSingletonList = Collections.singletonList((bM & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    mx0 mx0Var = new mx0();
                    mx0Var.f41075k = str;
                    mx0Var.f41068c = strA;
                    mx0Var.C = i;
                    mx0Var.f41077m = listSingletonList;
                    arrayList.add(new nx0(mx0Var));
                }
            }
            lb2Var.e(iM2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean a(int i) {
        return (i & this.f39849a) != 0;
    }
}

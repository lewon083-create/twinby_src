package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.ao1;
import com.google.android.gms.internal.ads.bn1;
import com.google.android.gms.internal.ads.bo1;
import com.google.android.gms.internal.ads.co1;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.ho1;
import com.google.android.gms.internal.ads.kn1;
import com.google.android.gms.internal.ads.m6;
import com.google.android.gms.internal.ads.mp1;
import com.google.android.gms.internal.ads.sn1;
import com.google.android.gms.internal.ads.so1;
import com.google.android.gms.internal.ads.tn1;
import com.google.android.gms.internal.ads.yo1;
import com.google.android.gms.internal.ads.zn1;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.google.android.gms.internal.ads.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1438e;

    public l(int i) {
        switch (i) {
            case 3:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f1437d = iHighestOneBit - 1;
                this.f1438e = new int[iHighestOneBit];
                break;
            default:
                this.f1437d = 0;
                this.f1438e = new com.google.android.gms.internal.ads.h[100];
                break;
        }
    }

    public static void E(int i) throws e0 {
        if ((i & 3) != 0) {
            throw new e0("Failed to parse the message.");
        }
    }

    public static void F(int i) throws e0 {
        if ((i & 7) != 0) {
            throw new e0("Failed to parse the message.");
        }
    }

    public static final void b0(int i) throws co1 {
        if ((i & 3) != 0) {
            throw new co1("Failed to parse the message.");
        }
    }

    public static final void c0(int i) throws co1 {
        if ((i & 7) != 0) {
            throw new co1("Failed to parse the message.");
        }
    }

    public void A(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.w()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.w()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public void B(int i) throws e0 {
        if (((k) this.f1438e).b() != i) {
            throw e0.e();
        }
    }

    public void C(int i) throws d0 {
        if ((this.f1435b & 7) != i) {
            throw e0.b();
        }
    }

    public boolean D() {
        int i;
        k kVar = (k) this.f1438e;
        if (kVar.c() || (i = this.f1435b) == this.f1436c) {
            return false;
        }
        return kVar.y(i);
    }

    public void G(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof ho1) {
            ho1 ho1Var = (ho1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    ho1Var.e(en1Var.o());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                ho1Var.e(en1Var.o());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Long.valueOf(en1Var.o()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Long.valueOf(en1Var.o()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void H(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    tn1Var.f(en1Var.q());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                tn1Var.f(en1Var.q());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Integer.valueOf(en1Var.q()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.q()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void I(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof ho1) {
            ho1 ho1Var = (ho1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new bo1();
                }
                int iX = en1Var.x();
                c0(iX);
                int iC = en1Var.c() + iX;
                do {
                    ho1Var.e(en1Var.r());
                } while (en1Var.c() < iC);
                return;
            }
            do {
                ho1Var.e(en1Var.r());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iX2 = en1Var.x();
                c0(iX2);
                int iC2 = en1Var.c() + iX2;
                do {
                    zn1Var.add(Long.valueOf(en1Var.r()));
                } while (en1Var.c() < iC2);
                return;
            }
            do {
                zn1Var.add(Long.valueOf(en1Var.r()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void J(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i == 2) {
                int iX = en1Var.x();
                b0(iX);
                int iC = en1Var.c() + iX;
                do {
                    tn1Var.f(en1Var.s());
                } while (en1Var.c() < iC);
                return;
            }
            if (i != 5) {
                throw new bo1();
            }
            do {
                tn1Var.f(en1Var.s());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 == 2) {
                int iX2 = en1Var.x();
                b0(iX2);
                int iC2 = en1Var.c() + iX2;
                do {
                    zn1Var.add(Integer.valueOf(en1Var.s()));
                } while (en1Var.c() < iC2);
                return;
            }
            if (i10 != 5) {
                throw new bo1();
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.s()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void K(zn1 zn1Var) throws co1 {
        int iH;
        en1 en1Var = (en1) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                zn1Var.add(Boolean.valueOf(en1Var.t()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            this.f1437d = iH;
            return;
        }
        if (i != 2) {
            throw new bo1();
        }
        int iC = en1Var.c() + en1Var.x();
        do {
            zn1Var.add(Boolean.valueOf(en1Var.t()));
        } while (en1Var.c() < iC);
        a0(iC);
    }

    public void L(zn1 zn1Var, boolean z5) throws bo1 {
        String strU;
        int iH;
        en1 en1Var = (en1) this.f1438e;
        if ((this.f1435b & 7) != 2) {
            throw new bo1();
        }
        do {
            if (z5) {
                W(2);
                strU = en1Var.v();
            } else {
                W(2);
                strU = en1Var.u();
            }
            zn1Var.add(strU);
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1435b);
        this.f1437d = iH;
    }

    public void M(zn1 zn1Var, yo1 yo1Var, kn1 kn1Var) throws co1 {
        int iH;
        int i = this.f1435b;
        if ((i & 7) != 2) {
            throw new bo1();
        }
        do {
            sn1 sn1VarH = yo1Var.h();
            X(sn1VarH, yo1Var, kn1Var);
            yo1Var.a(sn1VarH);
            zn1Var.add(sn1VarH);
            en1 en1Var = (en1) this.f1438e;
            if (en1Var.b() || this.f1437d != 0) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == i);
        this.f1437d = iH;
    }

    public void N(zn1 zn1Var, yo1 yo1Var, kn1 kn1Var) throws bo1 {
        int iH;
        int i = this.f1435b;
        if ((i & 7) != 3) {
            throw new bo1();
        }
        do {
            sn1 sn1VarH = yo1Var.h();
            Y(sn1VarH, yo1Var, kn1Var);
            yo1Var.a(sn1VarH);
            zn1Var.add(sn1VarH);
            en1 en1Var = (en1) this.f1438e;
            if (en1Var.b() || this.f1437d != 0) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == i);
        this.f1437d = iH;
    }

    public void O(zn1 zn1Var) throws bo1 {
        int iH;
        if ((this.f1435b & 7) != 2) {
            throw new bo1();
        }
        do {
            zn1Var.add(f0());
            en1 en1Var = (en1) this.f1438e;
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1435b);
        this.f1437d = iH;
    }

    public void P(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    tn1Var.f(en1Var.x());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                tn1Var.f(en1Var.x());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Integer.valueOf(en1Var.x()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.x()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void Q(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    tn1Var.f(en1Var.y());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                tn1Var.f(en1Var.y());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Integer.valueOf(en1Var.y()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.y()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void R(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i == 2) {
                int iX = en1Var.x();
                b0(iX);
                int iC = en1Var.c() + iX;
                do {
                    tn1Var.f(en1Var.z());
                } while (en1Var.c() < iC);
                return;
            }
            if (i != 5) {
                throw new bo1();
            }
            do {
                tn1Var.f(en1Var.z());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 == 2) {
                int iX2 = en1Var.x();
                b0(iX2);
                int iC2 = en1Var.c() + iX2;
                do {
                    zn1Var.add(Integer.valueOf(en1Var.z()));
                } while (en1Var.c() < iC2);
                return;
            }
            if (i10 != 5) {
                throw new bo1();
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.z()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void S(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof ho1) {
            ho1 ho1Var = (ho1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new bo1();
                }
                int iX = en1Var.x();
                c0(iX);
                int iC = en1Var.c() + iX;
                do {
                    ho1Var.e(en1Var.A());
                } while (en1Var.c() < iC);
                return;
            }
            do {
                ho1Var.e(en1Var.A());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iX2 = en1Var.x();
                c0(iX2);
                int iC2 = en1Var.c() + iX2;
                do {
                    zn1Var.add(Long.valueOf(en1Var.A()));
                } while (en1Var.c() < iC2);
                return;
            }
            do {
                zn1Var.add(Long.valueOf(en1Var.A()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void T(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof tn1) {
            tn1 tn1Var = (tn1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    tn1Var.f(en1Var.B());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                tn1Var.f(en1Var.B());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Integer.valueOf(en1Var.B()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Integer.valueOf(en1Var.B()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    public void U(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof ho1) {
            ho1 ho1Var = (ho1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    ho1Var.e(en1Var.C());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                ho1Var.e(en1Var.C());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Long.valueOf(en1Var.C()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Long.valueOf(en1Var.C()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r1.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(com.google.android.gms.internal.ads.jo1 r12, com.google.android.gms.internal.ads.l91 r13, com.google.android.gms.internal.ads.kn1 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.W(r0)
            java.lang.Object r1 = r11.f1438e
            com.google.android.gms.internal.ads.en1 r1 = (com.google.android.gms.internal.ads.en1) r1
            int r2 = r1.x()
            int r2 = r1.D(r2)
            java.lang.Object r3 = r13.f7467e
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.d0()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.b()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.b()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.f1435b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            int r7 = r11.f1436c     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.k(r6)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            com.google.android.gms.internal.ads.co1 r6 = new com.google.android.gms.internal.ads.co1     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f7466d     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            com.google.android.gms.internal.ads.mp1 r6 = (com.google.android.gms.internal.ads.mp1) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            java.lang.Object r5 = r11.Z(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f7465c     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            com.google.android.gms.internal.ads.mp1 r6 = (com.google.android.gms.internal.ads.mp1) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            r7 = 0
            java.lang.Object r4 = r11.Z(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.bo1 -> L4b
            goto L15
        L64:
            boolean r7 = r1.b()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.f1435b     // Catch: java.lang.Throwable -> L49
            int r10 = r11.f1436c     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.k(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            com.google.android.gms.internal.ads.co1 r12 = new com.google.android.gms.internal.ads.co1     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.a(r2)
            return
        L85:
            r1.a(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l.V(com.google.android.gms.internal.ads.jo1, com.google.android.gms.internal.ads.l91, com.google.android.gms.internal.ads.kn1):void");
    }

    public void W(int i) {
        if ((this.f1435b & 7) != i) {
            throw new bo1();
        }
    }

    public void X(Object obj, yo1 yo1Var, kn1 kn1Var) throws co1 {
        en1 en1Var = (en1) this.f1438e;
        int iX = en1Var.x();
        if (en1Var.f5013b + en1Var.f5014c >= 100) {
            throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iD = en1Var.D(iX);
        en1Var.f5013b++;
        yo1Var.c(obj, this, kn1Var);
        en1Var.i(0);
        en1Var.f5013b--;
        en1Var.a(iD);
    }

    public void Y(Object obj, yo1 yo1Var, kn1 kn1Var) {
        int i = this.f1436c;
        this.f1436c = ((this.f1435b >>> 3) << 3) | 4;
        try {
            yo1Var.c(obj, this, kn1Var);
            if (this.f1435b == this.f1436c) {
            } else {
                throw new co1("Failed to parse the message.");
            }
        } finally {
            this.f1436c = i;
        }
    }

    public Object Z(mp1 mp1Var, Class cls, kn1 kn1Var) throws co1 {
        en1 en1Var = (en1) this.f1438e;
        mp1 mp1Var2 = mp1.f7989d;
        switch (mp1Var.ordinal()) {
            case 0:
                W(1);
                return Double.valueOf(en1Var.l());
            case 1:
                W(5);
                return Float.valueOf(en1Var.m());
            case 2:
                W(0);
                return Long.valueOf(en1Var.o());
            case 3:
                W(0);
                return Long.valueOf(en1Var.n());
            case 4:
                W(0);
                return Integer.valueOf(en1Var.q());
            case 5:
                W(1);
                return Long.valueOf(en1Var.r());
            case 6:
                W(5);
                return Integer.valueOf(en1Var.s());
            case 7:
                W(0);
                return Boolean.valueOf(en1Var.t());
            case 8:
                W(2);
                return en1Var.v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                W(2);
                yo1 yo1VarA = so1.f10369c.a(cls);
                sn1 sn1VarH = yo1VarA.h();
                X(sn1VarH, yo1VarA, kn1Var);
                yo1VarA.a(sn1VarH);
                return sn1VarH;
            case 11:
                return f0();
            case 12:
                W(0);
                return Integer.valueOf(en1Var.x());
            case 13:
                W(0);
                return Integer.valueOf(en1Var.y());
            case 14:
                W(5);
                return Integer.valueOf(en1Var.z());
            case 15:
                W(1);
                return Long.valueOf(en1Var.A());
            case 16:
                W(0);
                return Integer.valueOf(en1Var.B());
            case 17:
                W(0);
                return Long.valueOf(en1Var.C());
        }
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f1438e;
        int i10 = this.f1436c;
        iArr[i10] = i;
        int i11 = this.f1437d & (i10 + 1);
        this.f1436c = i11;
        int i12 = this.f1435b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            kotlin.collections.o.e(0, i12, length, iArr, iArr2);
            kotlin.collections.o.e(i13, 0, this.f1435b, (int[]) this.f1438e, iArr2);
            this.f1438e = iArr2;
            this.f1435b = 0;
            this.f1436c = length;
            this.f1437d = i14 - 1;
        }
    }

    public void a0(int i) throws co1 {
        if (((en1) this.f1438e).c() != i) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public int b() {
        int i = this.f1437d;
        if (i != 0) {
            this.f1435b = i;
            this.f1437d = 0;
        } else {
            this.f1435b = ((k) this.f1438e).u();
        }
        int i10 = this.f1435b;
        if (i10 == 0 || i10 == this.f1436c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public void c(Object obj, c1 c1Var, q qVar) {
        int i = this.f1436c;
        this.f1436c = ((this.f1435b >>> 3) << 3) | 4;
        try {
            c1Var.h(obj, this, qVar);
            if (this.f1435b == this.f1436c) {
            } else {
                throw new e0("Failed to parse the message.");
            }
        } finally {
            this.f1436c = i;
        }
    }

    public void d(Object obj, c1 c1Var, q qVar) throws e0 {
        k kVar = (k) this.f1438e;
        int iV = kVar.v();
        if (kVar.f1432a >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = kVar.e(iV);
        kVar.f1432a++;
        c1Var.h(obj, this, qVar);
        kVar.a(0);
        kVar.f1432a--;
        kVar.d(iE);
    }

    public int d0() {
        int iH = this.f1437d;
        if (iH != 0) {
            this.f1435b = iH;
            this.f1437d = 0;
        } else {
            iH = ((en1) this.f1438e).h();
            this.f1435b = iH;
        }
        if (iH == 0 || iH == this.f1436c) {
            return Integer.MAX_VALUE;
        }
        return iH >>> 3;
    }

    public int e() {
        int i = this.f1435b;
        if (i == this.f1436c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = ((int[]) this.f1438e)[i];
        this.f1435b = (i + 1) & this.f1437d;
        return i10;
    }

    public synchronized void e0(int i) {
        int i10 = this.f1435b;
        this.f1435b = i;
        if (i < i10) {
            g();
        }
    }

    public void f(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Boolean.valueOf(kVar.f()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Boolean.valueOf(kVar.f()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public bn1 f0() {
        W(2);
        return ((en1) this.f1438e).w();
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void g() {
        int i = this.f1435b;
        String str = cq0.f4293a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.f1436c);
        int i10 = this.f1437d;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill((com.google.android.gms.internal.ads.h[]) this.f1438e, iMax, i10, (Object) null);
        this.f1437d = iMax;
    }

    public void g0(zn1 zn1Var) throws co1 {
        int iH;
        en1 en1Var = (en1) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 1) {
            do {
                zn1Var.add(Double.valueOf(en1Var.l()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            this.f1437d = iH;
            return;
        }
        if (i != 2) {
            throw new bo1();
        }
        int iX = en1Var.x();
        c0(iX);
        int iC = en1Var.c() + iX;
        do {
            zn1Var.add(Double.valueOf(en1Var.l()));
        } while (en1Var.c() < iC);
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized com.google.android.gms.internal.ads.h h() {
        com.google.android.gms.internal.ads.h hVar;
        try {
            int i = this.f1436c + 1;
            this.f1436c = i;
            int i10 = this.f1437d;
            if (i10 > 0) {
                com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1438e;
                int i11 = i10 - 1;
                this.f1437d = i11;
                hVar = hVarArr[i11];
                if (hVar == null) {
                    throw null;
                }
                hVarArr[i11] = null;
            } else {
                hVar = new com.google.android.gms.internal.ads.h(new byte[65536]);
                com.google.android.gms.internal.ads.h[] hVarArr2 = (com.google.android.gms.internal.ads.h[]) this.f1438e;
                int length = hVarArr2.length;
                if (i > length) {
                    this.f1438e = (com.google.android.gms.internal.ads.h[]) Arrays.copyOf(hVarArr2, length + length);
                    return hVar;
                }
            }
            return hVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void h0(zn1 zn1Var) throws co1 {
        int iH;
        en1 en1Var = (en1) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 2) {
            int iX = en1Var.x();
            b0(iX);
            int iC = en1Var.c() + iX;
            do {
                zn1Var.add(Float.valueOf(en1Var.m()));
            } while (en1Var.c() < iC);
            return;
        }
        if (i != 5) {
            throw new bo1();
        }
        do {
            zn1Var.add(Float.valueOf(en1Var.m()));
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1435b);
        this.f1437d = iH;
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void i(com.google.android.gms.internal.ads.h hVar) {
        com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1438e;
        int i = this.f1437d;
        this.f1437d = i + 1;
        hVarArr[i] = hVar;
        this.f1436c--;
        notifyAll();
    }

    public void i0(zn1 zn1Var) throws co1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1438e;
        if (zn1Var instanceof ho1) {
            ho1 ho1Var = (ho1) zn1Var;
            int i = this.f1435b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new bo1();
                }
                int iC = en1Var.c() + en1Var.x();
                do {
                    ho1Var.e(en1Var.n());
                } while (en1Var.c() < iC);
                a0(iC);
                return;
            }
            do {
                ho1Var.e(en1Var.n());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1435b);
        } else {
            int i10 = this.f1435b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new bo1();
                }
                int iC2 = en1Var.c() + en1Var.x();
                do {
                    zn1Var.add(Long.valueOf(en1Var.n()));
                } while (en1Var.c() < iC2);
                a0(iC2);
                return;
            }
            do {
                zn1Var.add(Long.valueOf(en1Var.n()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1435b);
            iH2 = iH;
        }
        this.f1437d = iH2;
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void j(m6 m6Var) {
        while (m6Var != null) {
            try {
                com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1438e;
                int i = this.f1437d;
                this.f1437d = i + 1;
                com.google.android.gms.internal.ads.h hVar = (com.google.android.gms.internal.ads.h) m6Var.f7790d;
                hVar.getClass();
                hVarArr[i] = hVar;
                this.f1436c--;
                m6Var = (m6) m6Var.f7791e;
                if (m6Var == null || ((com.google.android.gms.internal.ads.h) m6Var.f7790d) == null) {
                    m6Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public h k() throws d0 {
        C(2);
        return ((k) this.f1438e).g();
    }

    public void l(b0 b0Var) throws d0 {
        int iU;
        k kVar = (k) this.f1438e;
        if ((this.f1435b & 7) != 2) {
            throw e0.b();
        }
        do {
            b0Var.add(k());
            if (kVar.c()) {
                return;
            } else {
                iU = kVar.u();
            }
        } while (iU == this.f1435b);
        this.f1437d = iU;
    }

    public void m(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 1) {
            do {
                b0Var.add(Double.valueOf(kVar.h()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iV = kVar.v();
        F(iV);
        int iB = kVar.b() + iV;
        do {
            b0Var.add(Double.valueOf(kVar.h()));
        } while (kVar.b() < iB);
    }

    public void n(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.i()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.i()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public Object o(x1 x1Var, Class cls, q qVar) throws e0 {
        k kVar = (k) this.f1438e;
        switch (x1Var.ordinal()) {
            case 0:
                C(1);
                return Double.valueOf(kVar.h());
            case 1:
                C(5);
                return Float.valueOf(kVar.l());
            case 2:
                C(0);
                return Long.valueOf(kVar.n());
            case 3:
                C(0);
                return Long.valueOf(kVar.w());
            case 4:
                C(0);
                return Integer.valueOf(kVar.m());
            case 5:
                C(1);
                return Long.valueOf(kVar.k());
            case 6:
                C(5);
                return Integer.valueOf(kVar.j());
            case 7:
                C(0);
                return Boolean.valueOf(kVar.f());
            case 8:
                C(2);
                return kVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                C(2);
                c1 c1VarA = z0.f1519c.a(cls);
                z zVarI = c1VarA.i();
                d(zVarI, c1VarA, qVar);
                c1VarA.c(zVarI);
                return zVarI;
            case 11:
                return k();
            case 12:
                C(0);
                return Integer.valueOf(kVar.v());
            case 13:
                C(0);
                return Integer.valueOf(kVar.i());
            case 14:
                C(5);
                return Integer.valueOf(kVar.o());
            case 15:
                C(1);
                return Long.valueOf(kVar.p());
            case 16:
                C(0);
                return Integer.valueOf(kVar.q());
            case 17:
                C(0);
                return Long.valueOf(kVar.r());
        }
    }

    public void p(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 2) {
            int iV = kVar.v();
            E(iV);
            int iB = kVar.b() + iV;
            do {
                b0Var.add(Integer.valueOf(kVar.j()));
            } while (kVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.j()));
            if (kVar.c()) {
                return;
            } else {
                iU = kVar.u();
            }
        } while (iU == this.f1435b);
        this.f1437d = iU;
    }

    public void q(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 1) {
            do {
                b0Var.add(Long.valueOf(kVar.k()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iV = kVar.v();
        F(iV);
        int iB = kVar.b() + iV;
        do {
            b0Var.add(Long.valueOf(kVar.k()));
        } while (kVar.b() < iB);
    }

    public void r(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 2) {
            int iV = kVar.v();
            E(iV);
            int iB = kVar.b() + iV;
            do {
                b0Var.add(Float.valueOf(kVar.l()));
            } while (kVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Float.valueOf(kVar.l()));
            if (kVar.c()) {
                return;
            } else {
                iU = kVar.u();
            }
        } while (iU == this.f1435b);
        this.f1437d = iU;
    }

    public void s(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.m()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.m()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public void t(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.n()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.n()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public void u(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 2) {
            int iV = kVar.v();
            E(iV);
            int iB = kVar.b() + iV;
            do {
                b0Var.add(Integer.valueOf(kVar.o()));
            } while (kVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.o()));
            if (kVar.c()) {
                return;
            } else {
                iU = kVar.u();
            }
        } while (iU == this.f1435b);
        this.f1437d = iU;
    }

    public void v(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 1) {
            do {
                b0Var.add(Long.valueOf(kVar.p()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iV = kVar.v();
        F(iV);
        int iB = kVar.b() + iV;
        do {
            b0Var.add(Long.valueOf(kVar.p()));
        } while (kVar.b() < iB);
    }

    public void w(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.q()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.q()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public void x(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.r()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.r()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public void y(b0 b0Var, boolean z5) throws d0 {
        String strS;
        int iU;
        k kVar = (k) this.f1438e;
        if ((this.f1435b & 7) != 2) {
            throw e0.b();
        }
        do {
            if (z5) {
                C(2);
                strS = kVar.t();
            } else {
                C(2);
                strS = kVar.s();
            }
            b0Var.add(strS);
            if (kVar.c()) {
                return;
            } else {
                iU = kVar.u();
            }
        } while (iU == this.f1435b);
        this.f1437d = iU;
    }

    public void z(b0 b0Var) throws e0 {
        int iU;
        k kVar = (k) this.f1438e;
        int i = this.f1435b & 7;
        if (i == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.v()));
                if (kVar.c()) {
                    return;
                } else {
                    iU = kVar.u();
                }
            } while (iU == this.f1435b);
            this.f1437d = iU;
            return;
        }
        if (i != 2) {
            throw e0.b();
        }
        int iB = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.v()));
        } while (kVar.b() < iB);
        B(iB);
    }

    public l(en1 en1Var) {
        this.f1437d = 0;
        Charset charset = ao1.f3341a;
        if (en1Var == null) {
            throw new NullPointerException("input");
        }
        this.f1438e = en1Var;
        en1Var.f5015d = this;
    }

    public l(k kVar) {
        this.f1437d = 0;
        Charset charset = c0.f1368a;
        this.f1438e = kVar;
        kVar.f1433b = this;
    }
}

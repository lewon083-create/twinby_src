package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ps1 implements rm1, qm1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm1[] f42003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f42004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc0 f42005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42006e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f42007f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qm1 f42008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l73 f42009h;
    public rm1[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sy f42010j;

    public ps1(hc0 hc0Var, long[] jArr, rm1... rm1VarArr) {
        this.f42005d = hc0Var;
        this.f42003b = rm1VarArr;
        hc0Var.getClass();
        this.f42010j = hc0.a(new ux2[0]);
        this.f42004c = new IdentityHashMap();
        this.i = new rm1[0];
        for (int i = 0; i < rm1VarArr.length; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                this.f42003b[i] = new ns1(rm1VarArr[i], j10);
            }
        }
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        rm1[] rm1VarArr = this.i;
        return (rm1VarArr.length > 0 ? rm1VarArr[0] : this.f42003b[0]).a(j10, zw2Var);
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        if (this.f42006e.isEmpty()) {
            return this.f42010j.continueLoading(j10);
        }
        int size = this.f42006e.size();
        for (int i = 0; i < size; i++) {
            ((rm1) this.f42006e.get(i)).continueLoading(j10);
        }
        return false;
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) {
        for (rm1 rm1Var : this.i) {
            rm1Var.discardBuffer(j10, z5);
        }
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        return this.f42010j.getBufferedPositionUs();
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        return this.f42010j.getNextLoadPositionUs();
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        l73 l73Var = this.f42009h;
        l73Var.getClass();
        return l73Var;
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f42010j.isLoading();
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() {
        for (rm1 rm1Var : this.f42003b) {
            rm1Var.maybeThrowPrepareError();
        }
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (rm1 rm1Var : this.i) {
            long discontinuity = rm1Var.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && rm1Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (rm1 rm1Var2 : this.i) {
                    if (rm1Var2 == rm1Var) {
                        break;
                    }
                    if (rm1Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        this.f42010j.reevaluateBuffer(j10);
    }

    @Override // yads.rm1
    public final long seekToUs(long j10) {
        long jSeekToUs = this.i[0].seekToUs(j10);
        int i = 1;
        while (true) {
            rm1[] rm1VarArr = this.i;
            if (i >= rm1VarArr.length) {
                return jSeekToUs;
            }
            if (rm1VarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        qm1 qm1Var = this.f42008g;
        qm1Var.getClass();
        qm1Var.a((ux2) this);
    }

    @Override // yads.qm1
    public final void a(rm1 rm1Var) {
        this.f42006e.remove(rm1Var);
        if (!this.f42006e.isEmpty()) {
            return;
        }
        int i = 0;
        for (rm1 rm1Var2 : this.f42003b) {
            i += rm1Var2.getTrackGroups().f40444b;
        }
        k73[] k73VarArr = new k73[i];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            rm1[] rm1VarArr = this.f42003b;
            if (i10 < rm1VarArr.length) {
                l73 trackGroups = rm1VarArr[i10].getTrackGroups();
                int i12 = trackGroups.f40444b;
                int i13 = 0;
                while (i13 < i12) {
                    k73 k73VarA = trackGroups.a(i13);
                    k73 k73Var = new k73(i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + k73VarA.f40096c, k73VarA.f40098e);
                    this.f42007f.put(k73Var, k73VarA);
                    k73VarArr[i11] = k73Var;
                    i13++;
                    i11++;
                }
                i10++;
            } else {
                this.f42009h = new l73(k73VarArr);
                qm1 qm1Var = this.f42008g;
                qm1Var.getClass();
                qm1Var.a((rm1) this);
                return;
            }
        }
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f42008g = qm1Var;
        Collections.addAll(this.f42006e, this.f42003b);
        for (rm1 rm1Var : this.f42003b) {
            rm1Var.a(this, j10);
        }
    }

    @Override // yads.rm1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[pp0VarArr.length];
        int[] iArr2 = new int[pp0VarArr.length];
        for (int i = 0; i < pp0VarArr.length; i++) {
            ps2 ps2Var = ps2VarArr[i];
            Integer num = ps2Var == null ? null : (Integer) this.f42004c.get(ps2Var);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            pp0 pp0Var = pp0VarArr[i];
            if (pp0Var != null) {
                k73 k73Var = (k73) this.f42007f.get(pp0Var.b());
                k73Var.getClass();
                int i10 = 0;
                while (true) {
                    rm1[] rm1VarArr = this.f42003b;
                    if (i10 >= rm1VarArr.length) {
                        break;
                    }
                    int iIndexOf = rm1VarArr[i10].getTrackGroups().f40445c.indexOf(k73Var);
                    if (iIndexOf >= 0 && iIndexOf != -1) {
                        iArr2[i] = i10;
                        break;
                    }
                    i10++;
                }
            }
        }
        this.f42004c.clear();
        int length = pp0VarArr.length;
        ps2[] ps2VarArr2 = new ps2[length];
        ps2[] ps2VarArr3 = new ps2[pp0VarArr.length];
        pp0[] pp0VarArr2 = new pp0[pp0VarArr.length];
        ArrayList arrayList = new ArrayList(this.f42003b.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < this.f42003b.length) {
            for (int i12 = 0; i12 < pp0VarArr.length; i12++) {
                ps2VarArr3[i12] = iArr[i12] == i11 ? ps2VarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    pp0 pp0Var2 = pp0VarArr[i12];
                    pp0Var2.getClass();
                    k73 k73Var2 = (k73) this.f42007f.get(pp0Var2.b());
                    k73Var2.getClass();
                    pp0VarArr2[i12] = new ms1(pp0Var2, k73Var2);
                } else {
                    pp0VarArr2[i12] = null;
                }
            }
            int i13 = i11;
            long jA = this.f42003b[i11].a(pp0VarArr2, zArr, ps2VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jA;
            } else if (jA != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z5 = false;
            for (int i14 = 0; i14 < pp0VarArr.length; i14++) {
                if (iArr2[i14] == i13) {
                    ps2 ps2Var2 = ps2VarArr3[i14];
                    ps2Var2.getClass();
                    ps2VarArr2[i14] = ps2VarArr3[i14];
                    this.f42004c.put(ps2Var2, Integer.valueOf(i13));
                    z5 = true;
                } else if (iArr[i14] == i13 && ps2VarArr3[i14] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z5) {
                arrayList.add(this.f42003b[i13]);
            }
            i11 = i13 + 1;
        }
        System.arraycopy(ps2VarArr2, 0, ps2VarArr, 0, length);
        rm1[] rm1VarArr2 = (rm1[]) arrayList.toArray(new rm1[0]);
        this.i = rm1VarArr2;
        this.f42005d.getClass();
        this.f42010j = new sy(rm1VarArr2);
        return j11;
    }
}

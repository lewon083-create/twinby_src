package yads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kl extends q53 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f40237e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40240d;

    public kl(p73 p73Var) {
        super(p73Var);
    }

    public final boolean a(lb2 lb2Var) {
        if (this.f40238b) {
            lb2Var.e(lb2Var.f40464b + 1);
        } else {
            int iM = lb2Var.m();
            int i = (iM >> 4) & 15;
            this.f40240d = i;
            if (i == 2) {
                int i10 = f40237e[(iM >> 2) & 3];
                mx0 mx0Var = new mx0();
                mx0Var.f41075k = "audio/mpeg";
                mx0Var.f41088x = 1;
                mx0Var.f41089y = i10;
                this.f42193a.a(new nx0(mx0Var));
                this.f40239c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                mx0 mx0Var2 = new mx0();
                mx0Var2.f41075k = str;
                mx0Var2.f41088x = 1;
                mx0Var2.f41089y = 8000;
                this.f42193a.a(new nx0(mx0Var2));
                this.f40239c = true;
            } else if (i != 10) {
                throw new p53("Audio format not supported: " + this.f40240d);
            }
            this.f40238b = true;
        }
        return true;
    }

    public final boolean a(long j10, lb2 lb2Var) {
        if (this.f40240d == 2) {
            int i = lb2Var.f40465c - lb2Var.f40464b;
            this.f42193a.a(i, lb2Var);
            this.f42193a.a(j10, 1, i, 0, null);
            return true;
        }
        int iM = lb2Var.m();
        if (iM == 0 && !this.f40239c) {
            int i10 = lb2Var.f40465c - lb2Var.f40464b;
            byte[] bArr = new byte[i10];
            lb2Var.a(bArr, 0, i10);
            a aVarA = b.a(new kb2(i10, bArr), false);
            mx0 mx0Var = new mx0();
            mx0Var.f41075k = "audio/mp4a-latm";
            mx0Var.f41073h = aVarA.f36592c;
            mx0Var.f41088x = aVarA.f36591b;
            mx0Var.f41089y = aVarA.f36590a;
            mx0Var.f41077m = Collections.singletonList(bArr);
            this.f42193a.a(new nx0(mx0Var));
            this.f40239c = true;
            return false;
        }
        if (this.f40240d == 10 && iM != 1) {
            return false;
        }
        int i11 = lb2Var.f40465c - lb2Var.f40464b;
        this.f42193a.a(i11, lb2Var);
        this.f42193a.a(j10, 1, i11, 0, null);
        return true;
    }
}

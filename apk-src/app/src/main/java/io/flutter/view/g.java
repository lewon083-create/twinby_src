package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.firebase.messaging.y;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public String A;
    public String B;
    public int C;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public String K;
    public String L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float[] Q;
    public float[] R;
    public g S;
    public ArrayList V;
    public f W;
    public f X;
    public float[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25817a;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float[] f25820b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25821c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Rect f25822c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25827h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f25830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f25831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f25832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f25834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f25835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f25836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f25837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f25838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f25839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f25840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f25841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f25842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f25843y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f25844z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25819b = -1;
    public int D = -1;
    public boolean E = false;
    public final ArrayList T = new ArrayList();
    public final ArrayList U = new ArrayList();
    public boolean Y = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f25818a0 = true;

    public g(h hVar) {
        this.f25817a = hVar;
    }

    public static boolean a(g gVar, e eVar) {
        return (gVar.f25823d & eVar.f25811b) != 0;
    }

    public static CharSequence b(g gVar) {
        y yVar = new y();
        yVar.f14899b = gVar.f25836r;
        yVar.f14900c = gVar.f25837s;
        yVar.f14901d = gVar.d();
        SpannableString spannableStringA = yVar.a();
        y yVar2 = new y();
        yVar2.f14899b = gVar.f25834p;
        yVar2.f14900c = gVar.f25835q;
        yVar2.f14902e = gVar.A;
        yVar2.f14901d = gVar.d();
        SpannableString spannableStringA2 = yVar2.a();
        y yVar3 = new y();
        yVar3.f14899b = gVar.f25842x;
        yVar3.f14900c = gVar.f25843y;
        yVar3.f14901d = gVar.d();
        CharSequence[] charSequenceArr = {spannableStringA, spannableStringA2, yVar3.a()};
        CharSequence charSequenceConcat = null;
        for (int i = 0; i < 3; i++) {
            CharSequence charSequence = charSequenceArr[i];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = byteBuffer.getInt();
            int i12 = byteBuffer.getInt();
            int i13 = z.p(2)[byteBuffer.getInt()];
            int iM = z.m(i13);
            if (iM == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f25870a = i11;
                jVar.f25871b = i12;
                jVar.f25872c = i13;
                arrayList.add(jVar);
            } else if (iM == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                i iVar = new i();
                iVar.f25870a = i11;
                iVar.f25871b = i12;
                iVar.f25872c = i13;
                iVar.f25869d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f10 = fArr[3];
        fArr[0] = fArr[0] / f10;
        fArr[1] = fArr[1] / f10;
        fArr[2] = fArr[2] / f10;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(12)) {
            arrayList.add(this);
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.B;
        return (str == null || str.isEmpty()) ? this.f25817a.f25857m : this.B;
    }

    public final String e() {
        String str;
        if (g(13) && (str = this.f25834p) != null && !str.isEmpty()) {
            return this.f25834p;
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            String strE = ((g) it.next()).e();
            if (strE != null && !strE.isEmpty()) {
                return strE;
            }
        }
        return null;
    }

    public final boolean g(int i) {
        return (this.f25821c & ((long) gf.a.d(i))) != 0;
    }

    public final g h(float[] fArr, boolean z5) {
        float f10 = fArr[3];
        boolean z10 = false;
        float f11 = fArr[0] / f10;
        float f12 = fArr[1] / f10;
        if (f11 < this.M || f11 >= this.O || f12 < this.N || f12 >= this.P) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (g gVar : this.U) {
            if (!gVar.g(14)) {
                if (gVar.Y) {
                    gVar.Y = false;
                    if (gVar.Z == null) {
                        gVar.Z = new float[16];
                    }
                    if (!Matrix.invertM(gVar.Z, 0, gVar.R, 0)) {
                        Arrays.fill(gVar.Z, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, gVar.Z, 0, fArr3, 0);
                g gVarH = gVar.h(fArr2, z5);
                if (gVarH != null) {
                    return gVarH;
                }
                fArr = fArr3;
            }
        }
        if (z5 && this.i != -1) {
            z10 = true;
        }
        if (i() || z10) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        if (g(12)) {
            return false;
        }
        if (g(22)) {
            return true;
        }
        if (g(32)) {
            return false;
        }
        int i = this.f25823d;
        int i10 = h.f25845y;
        if ((i & (-61)) != 0 || (this.f25821c & ((long) 10682871)) != 0) {
            return true;
        }
        String str = this.f25834p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f25836r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f25842x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z5) {
        hashSet.add(this);
        if (this.f25818a0) {
            z5 = true;
        }
        if (z5) {
            if (this.f25820b0 == null) {
                this.f25820b0 = new float[16];
            }
            if (this.Q == null) {
                this.Q = new float[16];
            }
            Matrix.multiplyMM(this.f25820b0, 0, fArr, 0, this.Q, 0);
            float[] fArr2 = {this.M, this.N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.f25820b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.N;
            j(fArr4, this.f25820b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.P;
            j(fArr5, this.f25820b0, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.P;
            j(fArr6, this.f25820b0, fArr2);
            if (this.f25822c0 == null) {
                this.f25822c0 = new Rect();
            }
            this.f25822c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f25818a0 = false;
        }
        int i = -1;
        for (g gVar : this.T) {
            gVar.D = i;
            i = gVar.f25819b;
            gVar.k(this.f25820b0, hashSet, z5);
        }
    }
}

package t;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.consent_sdk.d6;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i7;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m.r2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f33317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f33319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f33320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f33321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f33322g;

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f33317b = obj;
        this.f33318c = obj2;
        this.f33319d = obj3;
        this.f33320e = obj4;
        this.f33321f = obj5;
        this.f33322g = obj6;
    }

    public static q3.o a(DataInputStream dataInputStream) {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i; i10++) {
            String utf = dataInputStream.readUTF();
            int i11 = dataInputStream.readInt();
            if (i11 < 0) {
                throw new IOException(l7.o.i(i11, "Invalid value size: "));
            }
            int iMin = Math.min(i11, 10485760);
            byte[] bArrCopyOf = m3.z.f28609b;
            int i12 = 0;
            while (i12 != i11) {
                int i13 = i12 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                dataInputStream.readFully(bArrCopyOf, i12, iMin);
                iMin = Math.min(i11 - i13, 10485760);
                i12 = i13;
            }
            map.put(utf, bArrCopyOf);
        }
        return new q3.o(map);
    }

    public static void b(q3.o oVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = oVar.f31677b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean c(int i, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int iC = r2.c(context, R.attr.colorControlHighlight);
        int iB = r2.b(context, R.attr.colorButtonNormal);
        int[] iArr = r2.f28356b;
        int[] iArr2 = r2.f28358d;
        int iC2 = x1.a.c(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, r2.f28357c, r2.f28360f}, new int[]{iB, iC2, x1.a.c(iC, i), i});
    }

    public static LayerDrawable i(m.x1 x1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = x1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = x1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void p(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = m.w0.f28391a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = m.q.f28337b;
        }
        drawableMutate.setColorFilter(m.q.b(i, mode));
    }

    public g0.h2 e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f33320e;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        g0.d2 d2VarD = g0.d2.d((w1) this.f33319d, size);
        d2VarD.f19527b.f19728c = 1;
        a0.l2 l2Var = new a0.l2(surface);
        this.f33317b = l2Var;
        k0.j.a(k0.j.f(l2Var.f19513e), new r3.b(8, surface, surfaceTexture), hl.d.j());
        d2VarD.b((a0.l2) this.f33317b, a0.i0.f112d, -1);
        g0.e2 e2Var = (g0.e2) this.f33322g;
        if (e2Var != null) {
            e2Var.b();
        }
        g0.e2 e2Var2 = new g0.e2(new a0.g1(3, this));
        this.f33322g = e2Var2;
        d2VarD.f19531f = e2Var2;
        return d2VarD.c();
    }

    public q3.k f(String str) {
        return (q3.k) ((HashMap) this.f33317b).get(str);
    }

    public int g() {
        int iQ;
        b4.e();
        f2.g.h("The ImageReader is not initialized.", ((a0.e2) this.f33318c) != null);
        a0.e2 e2Var = (a0.e2) this.f33318c;
        synchronized (e2Var.f68b) {
            iQ = e2Var.f71e.q() - e2Var.f69c;
        }
        return iQ;
    }

    public q3.k h(String str) {
        HashMap map = (HashMap) this.f33317b;
        q3.k kVar = (q3.k) map.get(str);
        if (kVar != null) {
            return kVar;
        }
        SparseArray sparseArray = (SparseArray) this.f33318c;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        q3.k kVar2 = new q3.k(iKeyAt, str, q3.o.f31675c);
        map.put(str, kVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f33320e).put(iKeyAt, true);
        ((q3.m) this.f33321f).f(kVar2);
        return kVar2;
    }

    public ColorStateList k(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return t1.b.b(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165290) {
            return t1.b.b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, r2.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return d(context, r2.c(context, R.attr.colorAccent));
            }
            if (i == 2131165285 || i == R.drawable.abc_spinner_textfield_background_material) {
                return t1.b.b(context, R.color.abc_tint_spinner);
            }
            if (c(i, (int[]) this.f33318c)) {
                return r2.d(context, R.attr.colorControlNormal);
            }
            if (c(i, (int[]) this.f33321f)) {
                return t1.b.b(context, R.color.abc_tint_default);
            }
            if (c(i, (int[]) this.f33322g)) {
                return t1.b.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return t1.b.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = r2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = r2.f28356b;
            iArr2[0] = r2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = r2.f28359e;
            iArr2[1] = r2.c(context, R.attr.colorControlActivated);
            iArr[2] = r2.f28360f;
            iArr2[2] = r2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = r2.f28356b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = r2.f28359e;
            iArr2[1] = r2.c(context, R.attr.colorControlActivated);
            iArr[2] = r2.f28360f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void l(long j10) {
        q3.m mVar;
        SparseArray sparseArray = (SparseArray) this.f33318c;
        HashMap map = (HashMap) this.f33317b;
        q3.m mVar2 = (q3.m) this.f33321f;
        mVar2.e(j10);
        q3.m mVar3 = (q3.m) this.f33322g;
        if (mVar3 != null) {
            mVar3.e(j10);
        }
        if (mVar2.c() || (mVar = (q3.m) this.f33322g) == null || !mVar.c()) {
            mVar2.g(map, sparseArray);
        } else {
            ((q3.m) this.f33322g).g(map, sparseArray);
            mVar2.b(map);
        }
        q3.m mVar4 = (q3.m) this.f33322g;
        if (mVar4 != null) {
            mVar4.delete();
            this.f33322g = null;
        }
    }

    public void m(String str) {
        SparseArray sparseArray = (SparseArray) this.f33318c;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f33320e;
        HashMap map = (HashMap) this.f33317b;
        q3.k kVar = (q3.k) map.get(str);
        if (kVar != null && kVar.f31667c.isEmpty() && kVar.f31668d.isEmpty()) {
            map.remove(str);
            int i = kVar.f31665a;
            boolean z5 = sparseBooleanArray.get(i);
            ((q3.m) this.f33321f).a(kVar, z5);
            if (z5) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.f33319d).put(i, true);
            }
        }
    }

    public void n(a0.r1 r1Var) {
        f0.o oVar;
        f0.o oVar2;
        b4.e();
        if (((f0.o) this.f33317b) == null) {
            com.google.android.gms.internal.auth.g.O("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + r1Var);
            r1Var.close();
            return;
        }
        if (((Integer) r1Var.x().c().f19735a.get(((f0.o) this.f33317b).i)) == null) {
            com.google.android.gms.internal.auth.g.O("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            r1Var.close();
            return;
        }
        b4.e();
        f0.c cVar = (f0.c) this.f33320e;
        Objects.requireNonNull(cVar);
        cVar.f16487a.accept(new f0.d((f0.o) this.f33317b, r1Var));
        f0.o oVar3 = (f0.o) this.f33317b;
        f0.a aVar = (f0.a) this.f33321f;
        boolean z5 = aVar != null && aVar.f16482h.size() > 1;
        if (z5 && (oVar2 = (f0.o) this.f33317b) != null) {
            oVar2.f16530b.b(r1Var.getFormat());
        }
        if (!z5 || ((oVar = (f0.o) this.f33317b) != null && oVar.f16530b.a())) {
            this.f33317b = null;
        }
        f0.q qVar = oVar3.f16536h;
        int i = oVar3.f16539l;
        if (i != -1 && i != 100) {
            oVar3.f16539l = 100;
            b4.e();
            if (!qVar.f16548g) {
                f0.f fVar = qVar.f16542a;
                fVar.f16497c.execute(new f0.t(fVar));
            }
        }
        b4.e();
        if (qVar.f16548g) {
            return;
        }
        if (!qVar.f16549h) {
            b4.e();
            if (!qVar.f16548g && !qVar.f16549h) {
                qVar.f16549h = true;
            }
        }
        qVar.f16546e.b(null);
    }

    public void o(f0.o oVar) {
        b4.e();
        f2.g.h("only one capture stage is supported.", oVar.f16537j.size() == 1);
        f2.g.h("Too many acquire images. Close image to be able to process next.", g() > 0);
        this.f33317b = oVar;
        k0.j.a(oVar.f16538k, new a1.e(22, this, oVar), hl.d.j());
    }

    public void q() {
        ((q3.m) this.f33321f).d((HashMap) this.f33317b);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f33319d;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.f33318c).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f33320e).clear();
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public zz j() {
        Application application = (Application) ((i7) this.f33317b).j();
        com.google.android.gms.internal.consent_sdk.s sVar = (com.google.android.gms.internal.consent_sdk.s) ((g7) this.f33318c).j();
        Handler handler = com.google.android.gms.internal.consent_sdk.f0.f13385a;
        com.google.android.gms.internal.consent_sdk.h0.c(handler);
        com.google.android.gms.internal.consent_sdk.e0 e0Var = com.google.android.gms.internal.consent_sdk.f0.f13386b;
        com.google.android.gms.internal.consent_sdk.h0.c(e0Var);
        return new zz(application, sVar, handler, e0Var, (com.google.android.gms.internal.consent_sdk.r0) ((i7) this.f33319d).j(), ((com.google.android.gms.internal.consent_sdk.f) ((i7) this.f33320e)).j(), (com.google.android.gms.internal.consent_sdk.k) ((d6) this.f33321f).j(), (com.google.android.gms.internal.consent_sdk.g) ((i7) this.f33322g).j());
    }
}

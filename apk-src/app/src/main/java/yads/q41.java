package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q41 extends ro2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f42170y = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f42171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public wp2 f42172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap.Config f42173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f42174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f42175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView.ScaleType f42176x;

    public q41(String str, f41 f41Var, int i, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, g41 g41Var) {
        super(0, str, g41Var);
        this.f42171s = new Object();
        a(new qe0(2.0f, 1000, 2));
        this.f42172t = f41Var;
        this.f42173u = config;
        this.f42174v = i;
        this.f42175w = i10;
        this.f42176x = scaleType;
    }

    @Override // yads.ro2
    public final void a() {
        super.a();
        synchronized (this.f42171s) {
            this.f42172t = null;
        }
    }

    public final xp2 b(h82 h82Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = h82Var.f39070b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f42174v == 0 && this.f42175w == 0) {
            options.inPreferredConfig = this.f42173u;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i10 = options.outHeight;
            int iA = a(this.f42174v, this.f42175w, i, i10, this.f42176x);
            int iA2 = a(this.f42175w, this.f42174v, i10, i, this.f42176x);
            options.inJustDecodeBounds = false;
            float f10 = 1.0f;
            while (true) {
                float f11 = 2.0f * f10;
                if (f11 > Math.min(((double) i) / ((double) iA), ((double) i10) / ((double) iA2))) {
                    break;
                }
                f10 = f11;
            }
            options.inSampleSize = (int) f10;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? new xp2(new ob2(h82Var)) : new xp2(bitmapDecodeByteArray, w11.a(h82Var));
    }

    @Override // yads.ro2
    public final int f() {
        return 1;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        wp2 wp2Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.f42171s) {
            wp2Var = this.f42172t;
        }
        if (wp2Var != null) {
            wp2Var.a(bitmap);
        }
    }

    public static int a(int i, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
        if (i != 0 || i10 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (((double) i11) * (((double) i10) / ((double) i12)));
                }
                if (i10 == 0) {
                    return i;
                }
                double d10 = ((double) i12) / ((double) i11);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i10;
                    return ((double) i) * d10 < d11 ? (int) (d11 / d10) : i;
                }
                double d12 = i10;
                return ((double) i) * d10 > d12 ? (int) (d12 / d10) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i11;
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        xp2 xp2VarB;
        synchronized (f42170y) {
            try {
                try {
                    xp2VarB = b(h82Var);
                } catch (OutOfMemoryError e3) {
                    int length = h82Var.f39070b.length;
                    boolean z5 = om3.f41652a;
                    return new xp2(new ob2(e3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xp2VarB;
    }
}

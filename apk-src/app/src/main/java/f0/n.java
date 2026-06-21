package f0;

import a0.b1;
import a0.e2;
import a0.g0;
import a0.g2;
import a0.l1;
import a0.o0;
import a0.r1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.measurement.j4;
import g0.a2;
import g0.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCharacteristics f16517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v7.f f16518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f16519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nc.e f16520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f16521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nc.e f16522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nc.e f16523h;
    public g8.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g8.g f16524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wd.d f16525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public wd.d f16526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f16527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f16528n;

    public n(Executor executor, CameraCharacteristics cameraCharacteristics) {
        a2 a2Var = n0.a.f28964a;
        if (n0.a.f28964a.i(LowMemoryQuirk.class) != null) {
            this.f16516a = new j0.i(executor);
        } else {
            this.f16516a = executor;
        }
        this.f16517b = cameraCharacteristics;
        this.f16527m = a2Var;
        this.f16528n = a2Var.h(IncorrectJpegMetadataQuirk.class);
    }

    public final r1 a(d dVar) {
        o oVar = dVar.f16491a;
        q0.b bVar = (q0.b) this.f16520e.f(dVar);
        ArrayList arrayList = this.f16519d.f16490d;
        f2.g.b(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((bVar.f31551c == 35 || this.f16528n) && iIntValue == 256) {
            q0.b bVar2 = (q0.b) this.f16521f.n(new b(bVar, oVar.f16534f));
            Size size = bVar2.f31552d;
            this.f16525k.getClass();
            e2 e2Var = new e2(a0.e.e(size.getWidth(), size.getHeight(), 256, 2));
            r1 r1VarB = ImageProcessingUtil.b(e2Var, (byte[]) bVar2.f31549a);
            e2Var.a();
            Objects.requireNonNull(r1VarB);
            i0.g gVar = bVar2.f31550b;
            Objects.requireNonNull(gVar);
            Rect rect = bVar2.f31553e;
            int i = bVar2.f31554f;
            Matrix matrix = bVar2.f31555g;
            v vVar = bVar2.f31556h;
            o0 o0Var = (o0) r1VarB;
            Size size2 = new Size(o0Var.getWidth(), o0Var.getHeight());
            o0Var.getFormat();
            bVar = new q0.b(r1VarB, gVar, o0Var.getFormat(), size2, rect, i, matrix, vVar);
        }
        this.f16524j.getClass();
        r1 r1Var = (r1) bVar.f31549a;
        g2 g2Var = new g2(r1Var, bVar.f31552d, new a0.h(r1Var.x().c(), r1Var.x().getTimestamp(), bVar.f31554f, bVar.f31555g, r1Var.x().d()));
        g2Var.b(bVar.f31553e);
        if (arrayList.size() > 1) {
            oVar.f16530b.b(g2Var.getFormat());
        }
        return g2Var;
    }

    public final nc.e b(d dVar) throws Exception {
        ArrayList arrayList = this.f16519d.f16490d;
        f2.g.b(!arrayList.isEmpty());
        Integer num = (Integer) arrayList.get(0);
        int iIntValue = num.intValue();
        f2.g.a("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, com.google.android.gms.internal.auth.m.n(iIntValue) || iIntValue == 32);
        o oVar = dVar.f16491a;
        g0 g0Var = oVar.f16531c;
        f fVar = oVar.f16530b;
        int i = oVar.f16534f;
        f2.g.a("OutputFileOptions cannot be empty", g0Var != null);
        q0.b bVar = (q0.b) this.f16520e.f(dVar);
        if (arrayList.size() > 1) {
            f2.g.a("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            if (bVar.f31551c != 32) {
                throw null;
            }
            Objects.requireNonNull(g0Var);
            nc.e eVarC = c(bVar, g0Var);
            fVar.b(32);
            return eVarC;
        }
        if (iIntValue == 32) {
            Objects.requireNonNull(g0Var);
            return c(bVar, g0Var);
        }
        Objects.requireNonNull(g0Var);
        q0.b bVar2 = (q0.b) this.f16521f.n(new b(bVar, i));
        if (i0.q.c(bVar2.f31553e, bVar2.f31552d)) {
            f2.g.h(null, com.google.android.gms.internal.auth.m.n(bVar2.f31551c));
            this.i.getClass();
            Rect rect = bVar2.f31553e;
            byte[] bArr = (byte[]) bVar2.f31549a;
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                i0.g gVar = bVar2.f31550b;
                Objects.requireNonNull(gVar);
                Rect rect2 = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int i10 = bVar2.f31554f;
                Matrix matrix = bVar2.f31555g;
                RectF rectF = i0.q.f20812a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                v vVar = bVar2.f31556h;
                Size size = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                if (vVar == null) {
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                this.f16522g.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                bVar2 = new q0.b(byteArrayOutputStream.toByteArray(), gVar, (Build.VERSION.SDK_INT < 34 || !g.j(bitmapDecodeRegion)) ? 256 : 4101, size, rect2, i10, matrix2, vVar);
            } catch (IOException e3) {
                throw new l1("Failed to decode JPEG.", e3, 1);
            }
        }
        nc.e eVar = this.f16523h;
        Objects.requireNonNull(g0Var);
        eVar.getClass();
        File fileL = j4.l(g0Var);
        byte[] bArr2 = (byte[]) bVar2.f31549a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileL);
            try {
                fileOutputStream.write(bArr2, 0, new m7.a(6).t(bArr2));
                fileOutputStream.close();
                i0.g gVar2 = bVar2.f31550b;
                Objects.requireNonNull(gVar2);
                int i11 = bVar2.f31554f;
                try {
                    gb gbVar = i0.g.f20768b;
                    i0.g gVar3 = new i0.g(new x2.g(fileL.toString()));
                    gVar2.a(gVar3);
                    if (gVar3.b() == 0 && i11 != 0) {
                        gVar3.c(i11);
                    }
                    gVar3.d();
                    j4.s(fileL, g0Var);
                    return new nc.e();
                } catch (IOException e7) {
                    throw new l1("Failed to update Exif data", e7, 1);
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new l1("Failed to write to temp file", e10, 1);
        }
    }

    public final nc.e c(q0.b bVar, g0 g0Var) throws Exception {
        int i = 0;
        if (this.f16518c == null) {
            CameraCharacteristics cameraCharacteristics = this.f16517b;
            if (cameraCharacteristics == null) {
                throw new l1("CameraCharacteristics is null, DngCreator cannot be created", null, 0);
            }
            if (bVar.f31556h.m() == null) {
                throw new l1("CameraCaptureResult is null, DngCreator cannot be created", null, 0);
            }
            CaptureResult captureResultM = bVar.f31556h.m();
            Objects.requireNonNull(captureResultM);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultM);
            v7.f fVar = new v7.f(13);
            fVar.f34767c = dngCreator;
            this.f16518c = fVar;
        }
        v7.f fVar2 = this.f16518c;
        r1 r1Var = (r1) bVar.f31549a;
        int i10 = bVar.f31554f;
        Objects.requireNonNull(g0Var);
        if (r1Var == null) {
            throw new NullPointerException("Null imageProxy");
        }
        fVar2.getClass();
        File fileL = j4.l(g0Var);
        DngCreator dngCreator2 = (DngCreator) fVar2.f34767c;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileL);
                    if (i10 == 0) {
                        i = 1;
                    } else if (i10 == 90) {
                        i = 6;
                    } else if (i10 == 180) {
                        i = 3;
                    } else if (i10 == 270) {
                        i = 8;
                    }
                    try {
                        dngCreator2.setOrientation(i);
                        dngCreator2.writeImage(fileOutputStream, r1Var.C());
                        fileOutputStream.close();
                        r1Var.close();
                        j4.s(fileL, g0Var);
                        return new nc.e();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IllegalArgumentException e3) {
                    throw new l1("Image with an unsupported format was used", e3, 1);
                } catch (IllegalStateException e7) {
                    throw new l1("Not enough metadata information has been set to write a well-formatted DNG file", e7, 1);
                }
            } catch (IOException e10) {
                throw new l1("Failed to write to temp file", e10, 1);
            }
        } catch (Throwable th4) {
            r1Var.close();
            throw th4;
        }
    }
}

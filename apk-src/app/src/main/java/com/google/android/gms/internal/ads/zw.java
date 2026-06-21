package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zw extends e1.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13132c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13133d;

    public zw(Context context) {
        super(5);
        this.f13133d = context;
    }

    @Override // e1.d0
    public final void A() {
        boolean isAdIdFakeForDebugLogging;
        BitmapDrawable bitmapDrawable;
        switch (this.f13132c) {
            case 0:
                bx bxVar = (bx) this.f13133d;
                cw cwVar = new cw(bxVar.f3944e, bxVar.f3945f.f34365b);
                synchronized (bxVar.f3940a) {
                    try {
                        c6 c6Var = p9.k.C.f31306m;
                        c6.q(bxVar.f3947h, cwVar);
                    } catch (IllegalArgumentException e3) {
                        u9.i.i("Cannot config CSI reporter.", e3);
                    }
                    break;
                }
                return;
            case 1:
                s9.d dVar = (s9.d) this.f13133d;
                ni.i iVar = p9.k.C.f31316w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) iVar.f29407c).get(Integer.valueOf(dVar.f32809d.f2557p.f31283g));
                if (bitmap != null) {
                    p9.f fVar = dVar.f32809d.f2557p;
                    boolean z5 = fVar.f31281e;
                    float f10 = fVar.f31282f;
                    Activity activity = dVar.f32808c;
                    if (z5 && f10 > 0.0f && f10 <= 25.0f) {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f10);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                        break;
                    } else {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    t9.g0.f33596l.post(new s9.i(0, this, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging((Context) this.f13133d);
                    break;
                } catch (IOException | IllegalStateException | ma.h | ma.i e7) {
                    u9.i.f("Fail to get isAdIdFakeForDebugLogging", e7);
                    isAdIdFakeForDebugLogging = false;
                }
                synchronized (u9.f.f34380b) {
                    u9.f.f34381c = true;
                    u9.f.f34382d = isAdIdFakeForDebugLogging;
                    break;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                sb2.append("Update ad debug logging enablement as ");
                sb2.append(isAdIdFakeForDebugLogging);
                u9.i.h(sb2.toString());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(bx bxVar) {
        super(5);
        Objects.requireNonNull(bxVar);
        this.f13133d = bxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(s9.d dVar) {
        super(5);
        this.f13133d = dVar;
    }
}

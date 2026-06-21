package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.om1;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements hi.f, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25711c;

    public /* synthetic */ n(int i, Object obj) {
        this.f25710b = i;
        this.f25711c = obj;
    }

    @Override // io.flutter.plugin.platform.h
    public void a(int i, int i10) {
        ((TextureRegistry$SurfaceProducer) this.f25711c).setSize(i, i10);
    }

    @Override // hi.f
    public void b(boolean z5) {
        ((q) this.f25711c).f25744s = z5;
    }

    public CharSequence c(hi.a aVar) {
        Activity activity = (Activity) ((d1.b) this.f25711c).f15508d;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (aVar != null) {
                            if (aVar == hi.a.f20561b) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e3) {
                                charSequence = charSequenceCoerceToText;
                                e = e3;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            charSequence = text;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                    return charSequence;
                } catch (SecurityException e10) {
                    Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
                    return charSequence;
                }
            } catch (IOException e11) {
                e = e11;
            }
        }
        return null;
    }

    @Override // hi.f
    public void d(int i, int i10) {
        View view;
        switch (this.f25710b) {
            case 0:
                q qVar = (q) this.f25711c;
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalStateException(om1.j("Trying to set unknown direction value: ", i10, "(view id: ", i, ")"));
                }
                if (qVar.o(i)) {
                    view = ((b0) qVar.f25736k.get(Integer.valueOf(i))).a();
                } else {
                    f fVar = (f) qVar.f25738m.get(i);
                    if (fVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
                        return;
                    }
                    view = fVar.getView();
                }
                if (view != null) {
                    view.setLayoutDirection(i10);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i);
                return;
            default:
                f fVar2 = (f) ((p) this.f25711c).f25719j.get(i);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i);
                    return;
                }
                View view2 = fVar2.getView();
                if (view2 != null) {
                    view2.setLayoutDirection(i10);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [io.flutter.plugin.platform.l] */
    @Override // hi.f
    public long e(final hi.c cVar) {
        i iVar;
        long j10;
        final q qVar = (q) this.f25711c;
        q.a(qVar, cVar);
        double d10 = cVar.f20570d;
        double d11 = cVar.f20569c;
        int i = cVar.f20567a;
        SparseArray sparseArray = qVar.f25741p;
        if (sparseArray.get(i) != null) {
            throw new IllegalStateException(l7.o.i(i, "Trying to create an already created platform view, view id: "));
        }
        if (qVar.f25733g == null) {
            throw new IllegalStateException(l7.o.i(i, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (qVar.f25731e == null) {
            throw new IllegalStateException(l7.o.i(i, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        final int i10 = 1;
        f fVarB = qVar.b(cVar, true);
        View view = fVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (j0.g.U(view, new fj.b0(29, q.f25727y))) {
            if (cVar.f20574h == 2) {
                q.e(19);
                if (qVar.f25732f.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!qVar.f25748w) {
                q.e(20);
                h hVarJ = q.j(qVar.f25733g);
                int iM = qVar.m(d11);
                int iM2 = qVar.m(d10);
                z2.w wVar = qVar.f25730d;
                a aVar = qVar.f25735j;
                int i11 = cVar.f20567a;
                ?? r62 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z5) {
                        switch (i10) {
                            case 0:
                                int i12 = cVar.f20567a;
                                q qVar2 = qVar;
                                if (!z5) {
                                    io.flutter.plugin.editing.i iVar2 = qVar2.f25734h;
                                    if (iVar2 != null) {
                                        iVar2.b(i12);
                                    }
                                    break;
                                } else {
                                    ii.q qVar3 = (ii.q) qVar2.i.f20375c;
                                    if (qVar3 != null) {
                                        qVar3.a("viewFocused", Integer.valueOf(i12), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (z5) {
                                    h3.e eVar = qVar.i;
                                    int i13 = cVar.f20567a;
                                    ii.q qVar4 = (ii.q) eVar.f20375c;
                                    if (qVar4 != null) {
                                        qVar4.a("viewFocused", Integer.valueOf(i13), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                y yVar = b0.i;
                b0 b0Var = null;
                if (iM != 0 && iM2 != 0) {
                    DisplayManager displayManager = (DisplayManager) wVar.getSystemService("display");
                    DisplayMetrics displayMetrics = wVar.getResources().getDisplayMetrics();
                    hVarJ.a(iM, iM2);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(l7.o.i(i11, "flutter-vd#"), iM, iM2, displayMetrics.densityDpi, hVarJ.getSurface(), 0, b0.i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        b0Var = new b0(wVar, aVar, virtualDisplayCreateVirtualDisplay, fVarB, hVarJ, r62, i11);
                    }
                }
                if (b0Var != null) {
                    qVar.f25736k.put(Integer.valueOf(i), b0Var);
                    View view2 = fVarB.getView();
                    qVar.f25737l.put(view2.getContext(), view2);
                    return hVarJ.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + cVar.f20568b + " with id: " + i);
            }
        }
        q.e(23);
        int iM3 = qVar.m(d11);
        int iM4 = qVar.m(d10);
        if (qVar.f25748w) {
            iVar = new i(qVar.f25730d);
            j10 = -1;
        } else {
            h hVarJ2 = q.j(qVar.f25733g);
            i iVar2 = new i(qVar.f25730d);
            iVar2.f25698g = hVarJ2;
            Surface surface = hVarJ2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            }
            long id2 = hVarJ2.getId();
            iVar = iVar2;
            j10 = id2;
        }
        iVar.setTouchProcessor(qVar.f25729c);
        h hVar = iVar.f25698g;
        if (hVar != null) {
            hVar.a(iM3, iM4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3, iM4);
        int iM5 = qVar.m(cVar.f20571e);
        int iM6 = qVar.m(cVar.f20572f);
        layoutParams.topMargin = iM5;
        layoutParams.leftMargin = iM6;
        iVar.setLayoutParams(layoutParams);
        View view3 = fVarB.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iM3, iM4));
        view3.setImportantForAccessibility(4);
        iVar.addView(view3);
        final int i12 = 0;
        iVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z5) {
                switch (i12) {
                    case 0:
                        int i122 = cVar.f20567a;
                        q qVar2 = qVar;
                        if (!z5) {
                            io.flutter.plugin.editing.i iVar22 = qVar2.f25734h;
                            if (iVar22 != null) {
                                iVar22.b(i122);
                            }
                            break;
                        } else {
                            ii.q qVar3 = (ii.q) qVar2.i.f20375c;
                            if (qVar3 != null) {
                                qVar3.a("viewFocused", Integer.valueOf(i122), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z5) {
                            h3.e eVar = qVar.i;
                            int i13 = cVar.f20567a;
                            ii.q qVar4 = (ii.q) eVar.f20375c;
                            if (qVar4 != null) {
                                qVar4.a("viewFocused", Integer.valueOf(i13), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        qVar.f25731e.addView(iVar);
        sparseArray.append(i, iVar);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f() {
        z2.w wVarJ;
        d1.b bVar = (d1.b) this.f25711c;
        xh.c cVar = (xh.c) bVar.f15510f;
        if (cVar != null) {
            xh.k kVar = (xh.k) cVar;
            xh.h hVar = kVar.Y;
            if (kVar.f45973g.getBoolean("should_automatically_handle_on_back_pressed", false) && (wVarJ = kVar.j()) != null) {
                boolean zIsEnabled = hVar.isEnabled();
                if (zIsEnabled) {
                    hVar.setEnabled(false);
                }
                wVarJ.getOnBackPressedDispatcher().b().a();
                if (zIsEnabled) {
                    hVar.setEnabled(true);
                    return;
                }
                return;
            }
        }
        Activity activity = (Activity) bVar.f15508d;
        if (activity instanceof d.x) {
            ((d.x) activity).getOnBackPressedDispatcher().b().a();
        } else {
            activity.finish();
        }
    }

    @Override // hi.f
    public void g(hi.c cVar) {
        q qVar = (q) this.f25711c;
        q.e(19);
        q.a(qVar, cVar);
        if (qVar.f25732f.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        qVar.b(cVar, false);
        q.e(19);
        if (qVar.f25732f.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f25711c).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f25711c).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f25711c).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f25711c).getWidth();
    }

    public void h(String str, g gVar) {
        HashMap map = (HashMap) this.f25711c;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, gVar);
    }

    public void i(ArrayList arrayList) {
        d1.b bVar = (d1.b) this.f25711c;
        int i = arrayList.isEmpty() ? 5894 : 1798;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int iOrdinal = ((hi.b) arrayList.get(i10)).ordinal();
            if (iOrdinal == 0) {
                i &= -5;
            } else if (iOrdinal == 1) {
                i &= -515;
            }
        }
        bVar.f15507c = i;
        bVar.E();
    }

    public void j(int i) {
        View decorView = ((Activity) ((d1.b) this.f25711c).f15508d).getWindow().getDecorView();
        switch (t.z.m(i)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.m, java.lang.Runnable] */
    @Override // hi.f
    public void k(hi.e eVar, final e8.e eVar2) {
        h hVar;
        q qVar = (q) this.f25711c;
        int iM = qVar.m(eVar.f20591b);
        int iM2 = qVar.m(eVar.f20592c);
        int i = eVar.f20590a;
        if (!qVar.o(i)) {
            f fVar = (f) qVar.f25738m.get(i);
            i iVar = (i) qVar.f25741p.get(i);
            if (fVar == null || iVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i);
                return;
            }
            if ((iM > iVar.getRenderTargetWidth() || iM2 > iVar.getRenderTargetHeight()) && (hVar = iVar.f25698g) != null) {
                hVar.a(iM, iM2);
            }
            ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
            layoutParams.width = iM;
            layoutParams.height = iM2;
            iVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iM;
                layoutParams2.height = iM2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) iVar.getRenderTargetWidth()) / ((double) qVar.h()));
            int iRound2 = (int) Math.round(((double) iVar.getRenderTargetHeight()) / ((double) qVar.h()));
            hi.g gVar = eVar2.f16294c;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            gVar.success(map);
            return;
        }
        final float fH = qVar.h();
        final b0 b0Var = (b0) qVar.f25736k.get(Integer.valueOf(i));
        io.flutter.plugin.editing.i iVar2 = qVar.f25734h;
        if (iVar2 != null) {
            if (iVar2.f25665e.f4005a == 3) {
                iVar2.f25675p = true;
            }
            SingleViewPresentation singleViewPresentation = b0Var.f25679a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                b0Var.f25679a.getView().getClass();
            }
        }
        ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                q qVar2 = (q) this.f25706b.f25711c;
                io.flutter.plugin.editing.i iVar3 = qVar2.f25734h;
                b0 b0Var2 = b0Var;
                if (iVar3 != null) {
                    if (iVar3.f25665e.f4005a == 3) {
                        iVar3.f25675p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = b0Var2.f25679a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        b0Var2.f25679a.getView().getClass();
                    }
                }
                double dH = qVar2.f25730d == null ? fH : qVar2.h();
                int iRound3 = (int) Math.round(((double) b0Var2.f25684f.getWidth()) / dH);
                int iRound4 = (int) Math.round(((double) b0Var2.f25684f.getHeight()) / dH);
                hi.g gVar2 = eVar2.f16294c;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                gVar2.success(map2);
            }
        };
        h hVar2 = b0Var.f25684f;
        if (iM == hVar2.getWidth() && iM2 == b0Var.f25684f.getHeight()) {
            b0Var.a().postDelayed(r32, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = b0Var.a();
            hVar2.a(iM, iM2);
            b0Var.f25686h.resize(iM, iM2, b0Var.f25682d);
            b0Var.f25686h.setSurface(hVar2.getSurface());
            viewA.postDelayed(r32, 0L);
            return;
        }
        boolean zIsFocused = b0Var.a().isFocused();
        v vVarDetachState = b0Var.f25679a.detachState();
        b0Var.f25686h.setSurface(null);
        b0Var.f25686h.release();
        DisplayManager displayManager = (DisplayManager) b0Var.f25680b.getSystemService("display");
        hVar2.a(iM, iM2);
        b0Var.f25686h = displayManager.createVirtualDisplay("flutter-vd#" + b0Var.f25683e, iM, iM2, b0Var.f25682d, hVar2.getSurface(), 0, b0.i, null);
        View viewA2 = b0Var.a();
        viewA2.addOnAttachStateChangeListener(new i7.j(viewA2, (m) r32));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(b0Var.f25680b, b0Var.f25686h.getDisplay(), b0Var.f25681c, vVarDetachState, b0Var.f25685g, zIsFocused);
        singleViewPresentation2.show();
        b0Var.f25679a.cancel();
        b0Var.f25679a = singleViewPresentation2;
    }

    @Override // hi.f
    public void m(int i, double d10, double d11) {
        q qVar = (q) this.f25711c;
        if (qVar.o(i)) {
            return;
        }
        i iVar = (i) qVar.f25741p.get(i);
        if (iVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
        } else {
            int iM = qVar.m(d10);
            int iM2 = qVar.m(d11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iVar.getLayoutParams();
            layoutParams.topMargin = iM;
            layoutParams.leftMargin = iM2;
            iVar.setLayoutParams(layoutParams);
        }
    }

    @Override // hi.f
    public void n(hi.d dVar) {
        switch (this.f25710b) {
            case 0:
                int i = dVar.f20575a;
                q qVar = (q) this.f25711c;
                float f10 = qVar.f25730d.getResources().getDisplayMetrics().density;
                if (!qVar.o(i)) {
                    f fVar = (f) qVar.f25738m.get(i);
                    if (fVar == null) {
                        Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
                    } else {
                        View view = fVar.getView();
                        if (view == null) {
                            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i);
                        } else {
                            view.dispatchTouchEvent(qVar.l(f10, dVar, false));
                        }
                    }
                    break;
                } else {
                    b0 b0Var = (b0) qVar.f25736k.get(Integer.valueOf(i));
                    MotionEvent motionEventL = qVar.l(f10, dVar, true);
                    SingleViewPresentation singleViewPresentation = b0Var.f25679a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(motionEventL);
                        break;
                    }
                }
                break;
            default:
                int i10 = dVar.f20575a;
                p pVar = (p) this.f25711c;
                float f11 = pVar.f25714d.getResources().getDisplayMetrics().density;
                f fVar2 = (f) pVar.f25719j.get(i10);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i10);
                } else {
                    View view2 = fVar2.getView();
                    if (view2 == null) {
                        Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i10);
                    } else {
                        long j10 = dVar.f20589p;
                        int i11 = dVar.f20579e;
                        MotionEvent motionEventX = pVar.f25721l.x(new xh.c0(j10));
                        List<List> list = (List) dVar.f20581g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d10 = f11;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
                            arrayList.add(pointerCoords);
                        }
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i11]);
                        if (motionEventX == null) {
                            List<List> list3 = (List) dVar.f20580f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            motionEventX = MotionEvent.obtain(dVar.f20576b.longValue(), dVar.f20577c.longValue(), dVar.f20578d, dVar.f20579e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i11]), pointerCoordsArr, dVar.f20582h, dVar.i, dVar.f20583j, dVar.f20584k, dVar.f20585l, dVar.f20586m, dVar.f20587n, dVar.f20588o);
                        } else if (pointerCoordsArr.length >= 1) {
                            motionEventX.offsetLocation(pointerCoordsArr[0].x - motionEventX.getX(), pointerCoordsArr[0].y - motionEventX.getY());
                        }
                        view2.dispatchTouchEvent(motionEventX);
                    }
                }
                break;
        }
    }

    @Override // hi.f
    public void q(int i) {
        View view;
        switch (this.f25710b) {
            case 0:
                q qVar = (q) this.f25711c;
                if (qVar.o(i)) {
                    view = ((b0) qVar.f25736k.get(Integer.valueOf(i))).a();
                } else {
                    f fVar = (f) qVar.f25738m.get(i);
                    if (fVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
                    } else {
                        view = fVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i);
                }
                break;
            default:
                f fVar2 = (f) ((p) this.f25711c).f25719j.get(i);
                if (fVar2 != null) {
                    View view2 = fVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i);
                }
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f25711c).release();
        this.f25711c = null;
    }

    @Override // hi.f
    public void s(int i) {
        di.a aVar;
        switch (this.f25710b) {
            case 0:
                q qVar = (q) this.f25711c;
                SparseArray sparseArray = qVar.f25739n;
                SparseArray sparseArray2 = qVar.f25741p;
                HashMap map = qVar.f25736k;
                SparseArray sparseArray3 = qVar.f25738m;
                f fVar = (f) sparseArray3.get(i);
                if (fVar != null) {
                    if (fVar.getView() != null) {
                        View view = fVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sparseArray3.remove(i);
                    try {
                        fVar.a();
                    } catch (RuntimeException e3) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e3);
                    }
                    if (!qVar.o(i)) {
                        i iVar = (i) sparseArray2.get(i);
                        if (iVar == null) {
                            di.b bVar = (di.b) sparseArray.get(i);
                            if (bVar != null) {
                                bVar.removeAllViews();
                                bVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) bVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(bVar);
                                }
                                sparseArray.remove(i);
                            }
                        } else {
                            iVar.removeAllViews();
                            h hVar = iVar.f25698g;
                            if (hVar != null) {
                                hVar.release();
                                iVar.f25698g = null;
                            }
                            ViewTreeObserver viewTreeObserver = iVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (aVar = iVar.f25699h) != null) {
                                iVar.f25699h = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) iVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(iVar);
                            }
                            sparseArray2.remove(i);
                        }
                    } else {
                        b0 b0Var = (b0) map.get(Integer.valueOf(i));
                        View viewA = b0Var.a();
                        if (viewA != null) {
                            qVar.f25737l.remove(viewA.getContext());
                        }
                        b0Var.f25679a.cancel();
                        b0Var.f25679a.detachState();
                        b0Var.f25686h.release();
                        b0Var.f25684f.release();
                        map.remove(Integer.valueOf(i));
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                }
                break;
            default:
                p pVar = (p) this.f25711c;
                SparseArray sparseArray4 = pVar.f25720k;
                SparseArray sparseArray5 = pVar.f25719j;
                f fVar2 = (f) sparseArray5.get(i);
                if (fVar2 != null) {
                    if (fVar2.getView() != null) {
                        View view2 = fVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    sparseArray5.remove(i);
                    try {
                        fVar2.a();
                    } catch (RuntimeException e7) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e7);
                    }
                    di.b bVar2 = (di.b) sparseArray4.get(i);
                    if (bVar2 != null) {
                        bVar2.removeAllViews();
                        bVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) bVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(bVar2);
                        }
                        sparseArray4.remove(i);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i);
                }
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f25711c).scheduleFrame();
    }

    public n(int i) {
        this.f25710b = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f25711c = new HashMap();
                break;
        }
    }
}

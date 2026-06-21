package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8693e;

    public /* synthetic */ oh0(ph0 ph0Var, Activity activity, s9.d dVar, int i) {
        this.f8690b = i;
        this.f8691c = ph0Var;
        this.f8692d = activity;
        this.f8693e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f8690b) {
            case 0:
                ph0 ph0Var = (ph0) this.f8691c;
                Activity activity = (Activity) this.f8692d;
                s9.d dVar = (s9.d) this.f8693e;
                HashMap map = new HashMap();
                map.put("dialog_action", VKApiCodes.EXTRA_CONFIRM);
                ph0Var.r4(ph0Var.f9068g, "rtsdc", map);
                activity.startActivity(p9.k.C.f31300f.n(activity));
                ph0Var.p4();
                if (dVar != null) {
                    dVar.z();
                }
                break;
            case 1:
                ph0 ph0Var2 = (ph0) this.f8691c;
                Activity activity2 = (Activity) this.f8692d;
                s9.d dVar2 = (s9.d) this.f8693e;
                ph0Var2.getClass();
                HashMap map2 = new HashMap();
                map2.put("dialog_action", VKApiCodes.EXTRA_CONFIRM);
                ph0Var2.r4(ph0Var2.f9068g, "dialog_click", map2);
                ph0Var2.o4(activity2, dVar2);
                break;
            default:
                at atVar = (at) this.f8693e;
                DownloadManager downloadManager = (DownloadManager) atVar.f3376e.getSystemService("download");
                try {
                    String str = (String) this.f8691c;
                    String str2 = (String) this.f8692d;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    t9.g0 g0Var = p9.k.C.f31297c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                } catch (IllegalStateException unused) {
                    atVar.z("Could not store picture.");
                }
                break;
        }
    }

    public oh0(at atVar, String str, String str2) {
        this.f8690b = 2;
        this.f8691c = str;
        this.f8692d = str2;
        this.f8693e = atVar;
    }
}

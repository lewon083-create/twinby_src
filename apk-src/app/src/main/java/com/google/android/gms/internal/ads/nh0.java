package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph0 f8310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s9.d f8311d;

    public /* synthetic */ nh0(ph0 ph0Var, s9.d dVar, int i) {
        this.f8309b = i;
        this.f8310c = ph0Var;
        this.f8311d = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f8309b) {
            case 0:
                ph0 ph0Var = this.f8310c;
                ph0Var.f9067f.b(ph0Var.f9068g);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                ph0Var.r4(ph0Var.f9068g, "dialog_click", map);
                s9.d dVar = this.f8311d;
                if (dVar != null) {
                    dVar.z();
                }
                break;
            default:
                ph0 ph0Var2 = this.f8310c;
                ph0Var2.f9067f.b(ph0Var2.f9068g);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                ph0Var2.r4(ph0Var2.f9068g, "rtsdc", map2);
                s9.d dVar2 = this.f8311d;
                if (dVar2 != null) {
                    dVar2.z();
                }
                break;
        }
    }
}

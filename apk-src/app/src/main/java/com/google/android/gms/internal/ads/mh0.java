package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7891d;

    public /* synthetic */ mh0(int i, Object obj, Object obj2) {
        this.f7889b = i;
        this.f7890c = obj;
        this.f7891d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f7889b) {
            case 0:
                ph0 ph0Var = (ph0) this.f7890c;
                s9.d dVar = (s9.d) this.f7891d;
                ph0Var.f9067f.b(ph0Var.f9068g);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                ph0Var.r4(ph0Var.f9068g, "dialog_click", map);
                if (dVar != null) {
                    dVar.z();
                }
                break;
            case 1:
                ph0 ph0Var2 = (ph0) this.f7890c;
                s9.d dVar2 = (s9.d) this.f7891d;
                ph0Var2.f9067f.b(ph0Var2.f9068g);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                ph0Var2.r4(ph0Var2.f9068g, "rtsdc", map2);
                if (dVar2 != null) {
                    dVar2.z();
                }
                break;
            default:
                ((JsPromptResult) this.f7890c).confirm(((EditText) this.f7891d).getText().toString());
                break;
        }
    }
}

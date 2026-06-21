package af;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import com.twinby.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import z2.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f923l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f924m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f925n0;
    public String o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public xe.a f926p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public WebView f927q0;

    @Override // z2.p, z2.t
    public final void G() {
        super.G();
        Window window = this.f45930g0.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // z2.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        xe.a aVar = this.f926p0;
        if (aVar != null) {
            aVar.f36086a.success(null);
        }
    }

    @Override // z2.p, z2.t
    public final void s() {
        this.E = true;
        try {
            this.f927q0.postUrl(this.f923l0, ("PaReq=" + URLEncoder.encode(this.f925n0, "UTF-8") + "&MD=" + URLEncoder.encode(this.f924m0, "UTF-8") + "&TermUrl=" + URLEncoder.encode(this.o0, "UTF-8")).getBytes());
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        }
    }

    @Override // z2.t
    public final void u() {
        this.E = true;
    }

    @Override // z2.p, z2.t
    public final void v(Context context) {
        super.v(context);
    }

    @Override // z2.p, z2.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        this.f923l0 = this.f45973g.getString("acs_url");
        this.f924m0 = this.f45973g.getString("md");
        this.f925n0 = this.f45973g.getString("pa_req");
        this.o0 = this.f45973g.getString("term_url");
    }

    @Override // z2.t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_three_ds, viewGroup, false);
        WebView webView = (WebView) viewInflate.findViewById(R.id.web_view_three_ds);
        this.f927q0 = webView;
        webView.setWebViewClient(new b(0));
        this.f927q0.getSettings().setDomStorageEnabled(true);
        this.f927q0.getSettings().setJavaScriptEnabled(true);
        this.f927q0.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f927q0.addJavascriptInterface(new a(this), "JavaScriptThreeDs");
        return viewInflate;
    }
}

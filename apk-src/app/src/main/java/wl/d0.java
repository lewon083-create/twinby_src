package wl;

import com.google.android.gms.internal.measurement.d4;
import io.sentry.SentryLockReason;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Device;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f35429j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f35430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f35431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f35432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f35433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f35434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f35435p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35437b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35438c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35439d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35440e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35441f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35442g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35443h = false;
    public boolean i = false;

    static {
        String[] strArr = {"html", "head", SentryLogEvent.JsonKeys.BODY, "frameset", "script", "noscript", "style", Mechanism.JsonKeys.META, "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", SentryLockReason.JsonKeys.ADDRESS, "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", RRWebVideoEvent.EVENT_TAG, "audio", "canvas", "details", "menu", "plaintext", "template", "article", SentryThread.JsonKeys.MAIN, "svg", "math"};
        f35430k = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", Device.TYPE, "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
        f35431l = new String[]{Mechanism.JsonKeys.META, "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", Device.TYPE, "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f35432m = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", SentryLockReason.JsonKeys.ADDRESS, "li", "th", "td", "script", "style", "ins", "del", "s"};
        f35433n = new String[]{"pre", "plaintext", "title", "textarea"};
        f35434o = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f35435p = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 63; i++) {
            String str = strArr[i];
            f35429j.put(str, new d0(str));
        }
        for (String str2 : f35430k) {
            d0 d0Var = new d0(str2);
            d0Var.f35437b = false;
            d0Var.f35438c = false;
            f35429j.put(str2, d0Var);
        }
        for (String str3 : f35431l) {
            d0 d0Var2 = (d0) f35429j.get(str3);
            k3.f.v(d0Var2);
            d0Var2.f35439d = false;
            d0Var2.f35440e = true;
        }
        for (String str4 : f35432m) {
            d0 d0Var3 = (d0) f35429j.get(str4);
            k3.f.v(d0Var3);
            d0Var3.f35438c = false;
        }
        for (String str5 : f35433n) {
            d0 d0Var4 = (d0) f35429j.get(str5);
            k3.f.v(d0Var4);
            d0Var4.f35442g = true;
        }
        for (String str6 : f35434o) {
            d0 d0Var5 = (d0) f35429j.get(str6);
            k3.f.v(d0Var5);
            d0Var5.f35443h = true;
        }
        for (String str7 : f35435p) {
            d0 d0Var6 = (d0) f35429j.get(str7);
            k3.f.v(d0Var6);
            d0Var6.i = true;
        }
    }

    public d0(String str) {
        this.f35436a = str;
    }

    public static d0 a(String str, c0 c0Var) {
        k3.f.v(str);
        HashMap map = f35429j;
        d0 d0Var = (d0) map.get(str);
        if (d0Var != null) {
            return d0Var;
        }
        c0Var.getClass();
        String strTrim = str.trim();
        if (!c0Var.f35383a) {
            strTrim = d4.p(strTrim);
        }
        k3.f.t(strTrim);
        d0 d0Var2 = (d0) map.get(strTrim);
        if (d0Var2 != null) {
            return d0Var2;
        }
        d0 d0Var3 = new d0(strTrim);
        d0Var3.f35437b = false;
        return d0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f35436a.equals(d0Var.f35436a) && this.f35439d == d0Var.f35439d && this.f35440e == d0Var.f35440e && this.f35438c == d0Var.f35438c && this.f35437b == d0Var.f35437b && this.f35442g == d0Var.f35442g && this.f35441f == d0Var.f35441f && this.f35443h == d0Var.f35443h && this.i == d0Var.i;
    }

    public final int hashCode() {
        return (((((((((((((((this.f35436a.hashCode() * 31) + (this.f35437b ? 1 : 0)) * 31) + (this.f35438c ? 1 : 0)) * 31) + (this.f35439d ? 1 : 0)) * 31) + (this.f35440e ? 1 : 0)) * 31) + (this.f35441f ? 1 : 0)) * 31) + (this.f35442g ? 1 : 0)) * 31) + (this.f35443h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        return this.f35436a;
    }
}

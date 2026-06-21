package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class th implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18648a;

    public th(sy syVar) {
        this.f18648a = syVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hs deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String str;
        String str2;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        hs hsVar = entityTemplate instanceof hs ? (hs) entityTemplate : null;
        if (hsVar == null) {
            str = string;
        } else if (hsVar instanceof vr) {
            str = "image";
        } else if (hsVar instanceof tr) {
            str = "gif";
        } else if (hsVar instanceof fs) {
            str = "text";
        } else if (hsVar instanceof as) {
            str = "separator";
        } else if (hsVar instanceof qr) {
            str = RRWebVideoEvent.JsonKeys.CONTAINER;
        } else if (hsVar instanceof ur) {
            str = "grid";
        } else if (hsVar instanceof sr) {
            str = "gallery";
        } else if (hsVar instanceof yr) {
            str = "pager";
        } else if (hsVar instanceof es) {
            str = "tabs";
        } else if (hsVar instanceof cs) {
            str = SentryThread.JsonKeys.STATE;
        } else if (hsVar instanceof rr) {
            str = "custom";
        } else if (hsVar instanceof wr) {
            str = "indicator";
        } else if (hsVar instanceof bs) {
            str = "slider";
        } else if (hsVar instanceof ds) {
            str = "switch";
        } else if (hsVar instanceof xr) {
            str = "input";
        } else if (hsVar instanceof zr) {
            str = "select";
        } else {
            if (!(hsVar instanceof gs)) {
                throw new ij.j();
            }
            str = RRWebVideoEvent.EVENT_TAG;
        }
        int iHashCode = str.hashCode();
        hs hsVar2 = hsVar;
        sy syVar = this.f18648a;
        switch (iHashCode) {
            case -1349088399:
                if (str.equals("custom")) {
                    return new rr(((ta) syVar.C2.getValue()).deserialize(parsingContext, (wa) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -906021636:
                if (str.equals("select")) {
                    return new zr(((jn) syVar.f18567w6.getValue()).deserialize(parsingContext, (nn) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -899647263:
                if (str.equals("slider")) {
                    return new bs(((gp) syVar.f18339a7.getValue()).deserialize(parsingContext, (mp) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -889473228:
                if (str.equals("switch")) {
                    return new ds(((xq) syVar.H7.getValue()).deserialize(parsingContext, (ar) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    return new wr(((kf) syVar.f18369d4.getValue()).deserialize(parsingContext, (nf) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -410956671:
                if (str.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                    return new qr(((y9) syVar.f18474n2.getValue()).deserialize(parsingContext, (da) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    return new sr(((wd) syVar.L3.getValue()).deserialize(parsingContext, (zd) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 102340:
                if (str.equals("gif")) {
                    return new tr(((de) syVar.O3.getValue()).deserialize(parsingContext, (ge) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new ur(((je) syVar.R3.getValue()).deserialize(parsingContext, (me) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 3552126:
                if (str.equals("tabs")) {
                    return new es(((gr) syVar.K7.getValue()).deserialize(parsingContext, (pr) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 3556653:
                if (str.equals("text")) {
                    return new fs(((zs) syVar.f18489o8.getValue()).deserialize(parsingContext, (ju) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 100313435:
                if (str.equals("image")) {
                    return new vr(((ve) syVar.X3.getValue()).deserialize(parsingContext, (ze) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 100358090:
                if (str.equals("input")) {
                    return new xr(((og) syVar.E4.getValue()).deserialize(parsingContext, (yg) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 106426307:
                if (str.equals("pager")) {
                    return new yr(((bk) syVar.f18577x5.getValue()).deserialize(parsingContext, (kk) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 109757585:
                if (str.equals(SentryThread.JsonKeys.STATE)) {
                    return new cs(((up) syVar.f18470m7.getValue()).deserialize(parsingContext, (yp) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 112202875:
                if (str.equals(RRWebVideoEvent.EVENT_TAG)) {
                    return new gs(((pw) syVar.f18450k9.getValue()).deserialize(parsingContext, (ww) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    return new as(((tn) syVar.C6.getValue()).deserialize(parsingContext, (xn) (hsVar2 != null ? hsVar2.a() : null), jSONObject));
                }
                str2 = "type";
                break;
            default:
                str2 = "type";
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, str2, str);
    }
}

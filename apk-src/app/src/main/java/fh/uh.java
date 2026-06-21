package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uh implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18699a;

    public uh(sy syVar) {
        this.f18699a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o0 resolve(ParsingContext parsingContext, hs hsVar, JSONObject jSONObject) {
        boolean z5 = hsVar instanceof vr;
        sy syVar = this.f18699a;
        if (z5) {
            return new o0(((we) syVar.Y3.getValue()).resolve(parsingContext, ((vr) hsVar).f18803a, jSONObject));
        }
        if (hsVar instanceof tr) {
            return new o0(((ee) syVar.P3.getValue()).resolve(parsingContext, ((tr) hsVar).f18661a, jSONObject));
        }
        if (hsVar instanceof fs) {
            return new o0(((at) syVar.f18499p8.getValue()).resolve(parsingContext, ((fs) hsVar).f17228a, jSONObject));
        }
        if (hsVar instanceof as) {
            return new o0(((un) syVar.D6.getValue()).resolve(parsingContext, ((as) hsVar).f16875a, jSONObject));
        }
        if (hsVar instanceof qr) {
            return new o0(((z9) syVar.o2.getValue()).resolve(parsingContext, ((qr) hsVar).f18195a, jSONObject));
        }
        if (hsVar instanceof ur) {
            return new o0(((ke) syVar.S3.getValue()).resolve(parsingContext, ((ur) hsVar).f18710a, jSONObject));
        }
        if (hsVar instanceof sr) {
            return new o0(((xd) syVar.M3.getValue()).resolve(parsingContext, ((sr) hsVar).f18323a, jSONObject));
        }
        if (hsVar instanceof yr) {
            return new o0(((ck) syVar.f18587y5.getValue()).resolve(parsingContext, ((yr) hsVar).f19185a, jSONObject));
        }
        if (hsVar instanceof es) {
            return new o0(((hr) syVar.L7.getValue()).resolve(parsingContext, ((es) hsVar).f17168a, jSONObject));
        }
        if (hsVar instanceof cs) {
            return new o0(((vp) syVar.f18479n7.getValue()).resolve(parsingContext, ((cs) hsVar).f17039a, jSONObject));
        }
        if (hsVar instanceof rr) {
            return new o0(((ua) syVar.D2.getValue()).resolve(parsingContext, ((rr) hsVar).f18260a, jSONObject));
        }
        if (hsVar instanceof wr) {
            return new o0(((lf) syVar.f18380e4.getValue()).resolve(parsingContext, ((wr) hsVar).f18925a, jSONObject));
        }
        if (hsVar instanceof bs) {
            return new o0(((hp) syVar.f18350b7.getValue()).resolve(parsingContext, ((bs) hsVar).f16955a, jSONObject));
        }
        if (hsVar instanceof ds) {
            return new o0(((yq) syVar.I7.getValue()).resolve(parsingContext, ((ds) hsVar).f17117a, jSONObject));
        }
        if (hsVar instanceof xr) {
            return new o0(((pg) syVar.F4.getValue()).resolve(parsingContext, ((xr) hsVar).f19065a, jSONObject));
        }
        if (hsVar instanceof zr) {
            return new o0(((kn) syVar.f18578x6.getValue()).resolve(parsingContext, ((zr) hsVar).f19292a, jSONObject));
        }
        if (hsVar instanceof gs) {
            return new o0(((qw) syVar.f18461l9.getValue()).resolve(parsingContext, ((gs) hsVar).f17308a, jSONObject));
        }
        throw new ij.j();
    }
}

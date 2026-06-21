package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17930a;

    public n3(sy syVar) {
        this.f17930a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m3 resolve(ParsingContext parsingContext, s3 s3Var, JSONObject jSONObject) {
        boolean z5 = s3Var instanceof q3;
        sy syVar = this.f17930a;
        if (z5) {
            ez ezVar = (ez) syVar.P9.getValue();
            fz fzVar = ((q3) s3Var).f18143a;
            ezVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, fzVar.f17250a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17480v);
            return new m3();
        }
        if (s3Var instanceof p3) {
            mx mxVar = (mx) syVar.A9.getValue();
            nx nxVar = ((p3) s3Var).f18083a;
            mxVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, nxVar.f18023a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17479u);
            return new m3();
        }
        if (s3Var instanceof r3) {
            ((nz) syVar.V9.getValue()).getClass();
            return new m3();
        }
        if (!(s3Var instanceof o3)) {
            throw new ij.j();
        }
        ((ix) syVar.f18581x9.getValue()).getClass();
        return new m3();
    }
}

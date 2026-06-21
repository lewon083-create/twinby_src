package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dl implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17114a;

    public dl(sy syVar) {
        this.f17114a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wk resolve(ParsingContext parsingContext, kl klVar, JSONObject jSONObject) {
        boolean z5 = klVar instanceof il;
        sy syVar = this.f17114a;
        if (z5) {
            al alVar = (al) syVar.K5.getValue();
            cl clVar = ((il) klVar).f17394a;
            alVar.getClass();
            al.a(parsingContext, clVar, jSONObject);
            return new wk();
        }
        if (!(klVar instanceof jl)) {
            throw new ij.j();
        }
        gl glVar = (gl) syVar.N5.getValue();
        hl hlVar = ((jl) klVar).f17493a;
        glVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, hlVar.f17341a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        return new wk();
    }
}

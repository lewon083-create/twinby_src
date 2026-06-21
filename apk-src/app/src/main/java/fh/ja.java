package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ja implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17485a;

    public ja(sy syVar) {
        this.f17485a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ia resolve(ParsingContext parsingContext, ma maVar, JSONObject jSONObject) {
        boolean z5 = maVar instanceof la;
        sy syVar = this.f17485a;
        if (z5) {
            ((rf) syVar.f18413h4.getValue()).getClass();
            return new ia();
        }
        if (!(maVar instanceof ka)) {
            throw new ij.j();
        }
        qc qcVar = (qc) syVar.f18484o3.getValue();
        rc rcVar = ((ka) maVar).f17570a;
        qcVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, rcVar.f18233a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17470l);
        return new ia();
    }
}

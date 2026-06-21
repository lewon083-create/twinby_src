package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bi implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16943a;

    public bi(sy syVar) {
        this.f16943a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yh resolve(ParsingContext parsingContext, ei eiVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, eiVar.f17148a, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ci.f17024b, ci.f17023a);
        Field field = eiVar.f17149b;
        sy syVar = this.f16943a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "color_map", syVar.R4, syVar.P4, ci.f17026d);
        JsonFieldResolver.resolveOptionalExpressionList(parsingContext, eiVar.f17150c, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, ci.f17025c);
        return new yh();
    }
}

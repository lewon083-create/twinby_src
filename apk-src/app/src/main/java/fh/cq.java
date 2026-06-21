package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17034a;

    public cq(sy syVar) {
        this.f17034a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zp resolve(ParsingContext parsingContext, eq eqVar, JSONObject jSONObject) {
        Field field = eqVar.f17166a;
        sy syVar = this.f17034a;
        if (((cd) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "item_spacing", syVar.f18575x3, syVar.f18554v3)) == null) {
            Expression expression = dq.f17115a;
        }
        JsonFieldResolver.resolveOptionalExpression(parsingContext, eqVar.f17167b, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, dq.f17116b, dq.f17115a);
        return new zp();
    }
}

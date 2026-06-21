package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bq implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16954a;

    public bq(sy syVar) {
        this.f16954a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eq deserialize(ParsingContext parsingContext, eq eqVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new eq(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, eqVar != null ? eqVar.f17166a : null, this.f16954a.f18564w3), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, eqVar != null ? eqVar.f17167b : null, ParsingConvertersKt.NUMBER_TO_INT, dq.f17116b));
    }
}

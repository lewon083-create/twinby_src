package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.sentry.SentryBaseEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u4 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18672a;

    public u4(sy syVar) {
        this.f18672a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z4 deserialize(ParsingContext parsingContext, z4 z4Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, z4Var != null ? z4Var.f19193a : null);
        Field field = z4Var != null ? z4Var.f19194b : null;
        sy syVar = this.f18672a;
        return new z4(fieldWithExpression, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, syVar.f18453l1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, z4Var != null ? z4Var.f19195c : null, syVar.f18453l1), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, SentryBaseEvent.JsonKeys.REQUEST, allowPropertyOverride, z4Var != null ? z4Var.f19196d : null, syVar.T0));
    }
}

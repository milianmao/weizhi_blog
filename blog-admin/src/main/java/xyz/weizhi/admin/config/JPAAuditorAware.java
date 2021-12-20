package xyz.weizhi.admin.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @Author milian
 * @Description
 * @Date 2021/12/20 0020 18:10
 * @Version 1.0
 */
public class JPAAuditorAware implements AuditorAware<Long> {
    @Override
    public Optional<Long> getCurrentAuditor() {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        Long id = snowflake.nextId();
        return Optional.of(id);
    }
}

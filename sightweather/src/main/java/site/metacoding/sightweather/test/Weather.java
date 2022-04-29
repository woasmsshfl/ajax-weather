package site.metacoding.sightweather.test;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tm; //  동네예보시각
    private String thema; // 관광지명
    private String courseId; // 관광코스ID
    private String courseAreaId; // 코스지역ID
    private String courseAreaName; // 코스지역이름
    private String courseName; // 코스명
    private String spotAreaId; // 지역ID
    private String spotAreaName; // 지역이름
    private String spotName; // 관광지명
    private String th3; // 3시간기온
    private String wd; // 풍향
    private String ws; // 풍속
    private String sky; // 하늘상태
    private String rhm; // 습도
    private String pop; // 강수량

}

package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;


    public BrandManager(BrandRepository brandRepository) {

        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
// iş kuralları managerden yazılacak.
        return brandRepository.getAll();
    }
}
